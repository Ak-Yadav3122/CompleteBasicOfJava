package MultithreadingAndExecutorServicees.UsingMultithreading.JoinMethod;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        PrintTask printTask1 = new PrintTask('*');
        PrintTask printTask2 = new PrintTask('@');
        PrintTask printTask3 = new PrintTask('#');
        PrintTask printTask4 = new PrintTask('$');

             // creating the object of thread and pass the ruunable on their constuctor
             Thread t1 = new Thread(printTask1);
             t1.start();
             Thread t2 = new Thread(printTask2);
             t2.start();
             t1.join(); // Its means when the thread t1 is completed then thread t3 is started executing.
             Thread t3 = new Thread(printTask3);
             t3.start();

             Thread t4 = new Thread(printTask4);
             t4.start();

        long end = System.currentTimeMillis();
        Long reault = end - start;
        System.out.println( "\n " + Thread.currentThread().getName() +" Total time is: " + reault + " ms");
    }
}
