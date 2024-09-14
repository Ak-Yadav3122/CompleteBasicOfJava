package MultithreadingAndExecutorServicees.UsingMultithreading.SynchronizeKeyword;

public class TestingSynchronize {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        try { //without Synchronized keyword 
            // t1.start();
            // t1.join();
            // t2.start();
            // t2.join();

            //By the use of sysnchronized keyword we make the increment method synchronize by using synchronize keyword
            t1.start();
            t2.start();

 // when the task of t1 and t2 are completed then next line of code are execcuted so we use join
            t1.join();
            t2.join();
        }

        catch (InterruptedException e) {
            System.out.println("Thread Interrupted: " + e.getMessage());
        }
        long end = System.currentTimeMillis();
        long result = end - start;

        System.out.println("Final counter value: " + counter.getCount() + " And its takes: " + result + "ms");

    }
}
