package reflections.dependencyinjections;

class ServiceA {
    @Inject
    private ServiceB serviceB;

    public void execute() {
        serviceB.perform();
    }
}