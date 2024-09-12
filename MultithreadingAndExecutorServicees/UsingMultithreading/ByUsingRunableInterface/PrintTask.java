package MultithreadingAndExecutorServicees.UsingMultithreading.ByUsingRunableInterface;

public class PrintTask implements Runnable{

    private final char targetChar;

    public PrintTask(char targetChar){
        this.targetChar = targetChar;
    }
    @Override
    public void run() {
        // first Task
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + ","+ targetChar);
        }
        System.out.println( "\n " + Thread.currentThread().getName() + targetChar + " task completed");
    }
    
}
