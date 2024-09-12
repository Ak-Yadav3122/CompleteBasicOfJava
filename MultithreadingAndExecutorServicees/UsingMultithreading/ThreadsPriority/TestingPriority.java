package MultithreadingAndExecutorServicees.UsingMultithreading.ThreadsPriority;

public class TestingPriority {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        PrintTask printTask1 = new PrintTask('*');
        PrintTask printTask2 = new PrintTask('@');
        PrintTask printTask3 = new PrintTask('#');
        PrintTask printTask4 = new PrintTask('$');

        // creating the object of thread and pass the ruunable on their constuctor
        Thread t1 = new Thread(printTask1);
        //If we want to set t1 at max priority then we use  t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        Thread t2 = new Thread(printTask2);
        t2.setPriority(7);
        t2.start();

        Thread t3 = new Thread(printTask3);
        t3.setPriority(5);
        t3.start();
         
        Thread t4 = new Thread(printTask4);
        t4.setPriority(Thread.MIN_PRIORITY);
        t4.start();

        long end = System.currentTimeMillis();
        Long reault = end - start;
        System.out.println( "\n " + Thread.currentThread().getName() +" Total time is: " + reault + " ms");
    }
}
