package reflections.customeobjectmapper;
import javax.imageio.ImageIO;
import java.lang.reflect.Field;
import java.util.*;
public class CustomeObject {
    public static <T> T toObject(Class<T> cls,Map<String,Object>properties){
        try{
           T object=cls.getDeclaredConstructor().newInstance();
            for(Map.Entry<String,Object> entry: properties.entrySet()){
                String fieldName=entry.getKey();
                Object value=entry.getValue();
                try{
                    Field field=cls.getDeclaredField(fieldName);
                    field.setAccessible(true);

                    field.set(object,value);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            return object;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String args[]){
        Map<String, Object> data = new HashMap<>();
        data.put("name","Gagan");
        data.put("age",21);
        data.put("city","Bhopal");
        Person person = toObject(Person.class, data);
        System.out.println(person);
    }
}
