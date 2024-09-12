package MultithreadingAndExecutorServicees.UsingMultithreading.ByUsingThreadClass;

public class SecondTask extends Thread {
    @Override
    public void run() {
          // second Task
          for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "#");
        }
        System.out.println("\n " + Thread.currentThread().getName() + " # task completed");

    }
}