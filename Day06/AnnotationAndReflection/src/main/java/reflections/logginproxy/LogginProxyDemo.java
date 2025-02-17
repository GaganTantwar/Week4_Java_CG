package reflections.logginproxy;

public class LogginProxyDemo {
    public static void main(String[] args) {
        // Create a real object
        Greeting greeting = new GreetingUse();

        // Create a proxy that logs method calls
        Greeting proxy = ProxyFactory.createProxy(greeting, Greeting.class);

        // Call method on proxy
        proxy.sayHello("Alice");
    }
}
