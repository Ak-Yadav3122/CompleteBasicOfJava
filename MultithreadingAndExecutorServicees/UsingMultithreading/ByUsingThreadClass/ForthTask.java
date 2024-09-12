package MultithreadingAndExecutorServicees.UsingMultithreading.ByUsingThreadClass;

public class ForthTask extends Thread {
    @Override
    public void run() {
        // fourth Task

        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "@");
        }
        System.out.println("\n " + Thread.currentThread().getName() + "  @ task completed");
    }

}
