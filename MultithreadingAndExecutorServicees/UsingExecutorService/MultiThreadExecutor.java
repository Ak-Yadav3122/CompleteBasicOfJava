package MultithreadingAndExecutorServicees.UsingExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import MultithreadingAndExecutorServicees.UsingMultithreading.ByUsingRunableInterface.PrintTask;

public class MultiThreadExecutor {
    public static void main(String[] args) {

        // for creating a multi threads we use i.e; ExecutorService service =Executors.newFixedThreadPool(here we pass the number of threads);
          
        ExecutorService service = Executors.newFixedThreadPool(3);
        PrintTask task1 = new PrintTask('*');
        PrintTask task2 = new PrintTask('#');
        PrintTask task3 = new PrintTask('&');
        

    //to start the executor service we use .submit() and we pass the tassk name as an argument
    service.submit(task1);
    service.submit(task2);
    service.submit(task3);

    
    //to stop the executor service after the task completion we use .shutdown() 
    service.shutdown();
    }
    }

