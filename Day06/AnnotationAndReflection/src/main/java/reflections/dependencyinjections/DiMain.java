package reflections.dependencyinjections;

public class DiMain {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();

        // Register the classes
        container.register(ServiceA.class);
        container.register(ServiceB.class);

        // Retrieve an instance and use it
        ServiceA serviceA = container.getInstance(ServiceA.class);
        serviceA.execute();
    }
}
