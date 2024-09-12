package MultithreadingAndExecutorServicees.UsingMultithreading.ByUsingThreadClass;

public class TestThread {
    public static void main(String[] args) {

        // System.currentTimeMillis() is used to determine the total current taken by
        // the system.
        long startTime = System.currentTimeMillis();
        FirstTask firstTask = new FirstTask();
        SecondTask secondTask = new SecondTask();
        ThirdTask thirdTask = new ThirdTask();
        ForthTask forthTask = new ForthTask();

        System.out.println("First task starts");
        firstTask.start();
        System.out.println("second task starts");
        secondTask.start();
        System.out.println("Third task starts");
        thirdTask.start();
        System.out.println("Forth task starts");
        forthTask.start();

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println( "\n " + Thread.currentThread().getName() +" Total time is: " + totalTime + " ms"); //Thread.currentThread().getName() is used to find the current Thred name.
    }
}
