package MultithreadingAndExecutorServicees.UsingMultithreading.ReturnReasultExecutorService;

import java.util.concurrent.Executors;
// import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;

public class FutureReault {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(1);
        FetchName name1 = new FetchName("Golu");
        FetchName name2 = new FetchName("Arpita");
        FetchName name3 = new FetchName("Anuradha");
        FetchName name4 = new FetchName("Neha");

        /*
         * Future<String> means it return the string in future when the task are
         * completed and stored on variable so we find the value by using .get() on tat varible 
         * and it is same as promis concept which are used in javascript.
         */

        Future<String> result1 = service.submit(name1);
        Future<String> result2 = service.submit(name2);
        Future<String> result3 = service.submit(name3);
        Future<String> result4 = service.submit(name4);

        /*
         * when we use .get()method then the main tread stop util the completion of that task where the .get()method call
         * .get()method return the exception so we have to handel it either the use of
         * try catch or we use throws keyword to handle the exception.
         */

            System.out.println("Your FullName is: "+result1.get()); //here main thread stop, when result1 completed then it again starts.
            System.out.println("Your FullName is: "+result2.get());
            System.out.println("Your FullName is: "+result3.get());
            System.out.println("Your FullName is: "+result4.get());

        service.shutdown();

    }
}
