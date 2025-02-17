package reflections.logginproxy;


public class GreetingUse  implements  Greeting{
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

}
