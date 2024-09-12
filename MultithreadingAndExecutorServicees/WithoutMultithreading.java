package MultithreadingAndExecutorServicees;

public class WithoutMultithreading {
    public static void main(String[] args) {
        // System.currentTimeMillis() is used to determine the total current taken by the system.

        long startTime = System.currentTimeMillis();

         // first Task
         for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "*");
        }
        System.out.println("\n * task completed"); 
        
        // second Task
         for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "#");
        }
        System.out.println("\n # task completed"); 
        
        // third Task
         for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "$");
        }
        System.out.println("\n $ task completed"); 
        
        // fourth Task
         for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "@");
        }
        System.out.println("\n @ task completed");
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("total time is: " + totalTime + "ms");
    }
}
