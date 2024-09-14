package MultithreadingAndExecutorServicees.UsingMultithreading.ThreadCommunicationMethod;


public class SleepMethod {
    public static void main(String[] args) throws Exception{
        System.out.println("Before sleeping");
        Thread.sleep(10000);
        System.out.println("Wake up");
    }
}
