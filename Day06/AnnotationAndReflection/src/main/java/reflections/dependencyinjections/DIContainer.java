package reflections.dependencyinjections;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {

    private Map<Class<?>, Object> instances = new HashMap<>();

    public void register(Class<?> clazz) throws Exception {
        Object instance = createInstance(clazz);
        instances.put(clazz, instance);
    }

    public <T> T getInstance(Class<T> clazz) {
        return clazz.cast(instances.get(clazz));
    }

    private Object createInstance(Class<?> clazz) throws Exception {
        Object instance = clazz.getDeclaredConstructor().newInstance();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = instances.get(fieldType);

                if (dependency == null) {
                    dependency = createInstance(fieldType);
                    instances.put(fieldType, dependency);
                }

                field.setAccessible(true);
                field.set(instance, dependency);
            }
        }
        return instance;
    }
}
