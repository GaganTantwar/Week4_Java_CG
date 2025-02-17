package reflections.logginproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.*;
public class LoginHandler implements InvocationHandler {
    private final Object target;

    public LoginHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log method invocation
        System.out.println("Executing method: " + method.getName());

        // Execute the actual method on the original object
        return method.invoke(target, args);
    }
}
