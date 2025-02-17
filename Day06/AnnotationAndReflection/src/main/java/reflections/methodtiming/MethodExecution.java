package reflections.methodtiming;

public class MethodExecution {
    // Main Method

    public static void main(String[] args) throws Exception {
        MethodClass example = new MethodClass();

        MethodExecuterTimer.measureExecutionTime(example, "method1");
        MethodExecuterTimer.measureExecutionTime(example, "method2");
    }
}
