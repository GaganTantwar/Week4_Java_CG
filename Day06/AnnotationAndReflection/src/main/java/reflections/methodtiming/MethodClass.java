package reflections.methodtiming;

public class MethodClass {
    public void method1() {
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void method2() {
        try {
            Thread.sleep(200); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
