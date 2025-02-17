package reflections.logginproxy;
import java.lang.reflect.*;
import reflections.logginproxy.LoginHandler;
public class ProxyFactory {
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new LoginHandler(target)
        );
    }
}
