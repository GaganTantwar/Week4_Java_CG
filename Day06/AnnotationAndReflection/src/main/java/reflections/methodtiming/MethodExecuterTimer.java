package reflections.methodtiming;

import java.lang.reflect.Method;

public class MethodExecuterTimer {

    public static void measureExecutionTime(Object obj, String methodName, Class<?>... parameterTypes) throws Exception {
        Method method = obj.getClass().getMethod(methodName, parameterTypes);
        long startTime = System.nanoTime();

        // Assuming the method has no parameters for simplicity
        method.invoke(obj);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Execution time of " + methodName + ": " + duration + " nanoseconds");
    }
}
