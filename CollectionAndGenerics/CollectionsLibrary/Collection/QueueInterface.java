package CollectionAndGenerics.CollectionsLibrary.Collection;
import java.util.*;
public class QueueInterface {
    public static void main(String[] args) {
        //Creating the Queue by using linkedlist
        Queue<String> queue = new LinkedList<String>();

        //adding elements
        queue.add("Aichchhik");
        queue.add("Abhay");
        queue.add("Shashank");
        queue.add("Aniket");
        queue.add("Abhishek");

        //Showing the collection of Queue elements
        for (String string : queue) {
            System.out.println(string);
        }

        //.element() are used for Retrives the elements which are present on head of the queue but throw the exception if the queue is empty.
        System.out.println(queue.element());

        //.peek() are used for Retrives the elements which are present on head of the queue but return null if the queue is empty.
        System.out.println("Top Elements are: "+ queue.peek());

        //Removing the head of queue
        System.out.println(queue.remove());
    }
}
