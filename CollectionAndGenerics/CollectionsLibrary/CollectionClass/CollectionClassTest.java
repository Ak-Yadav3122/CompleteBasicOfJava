package CollectionAndGenerics.CollectionsLibrary.CollectionClass;

import java.util.*;

public class CollectionClassTest {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();

        // Adding the integer into the list
        numList.add(22);
        numList.add(41);
        numList.add(32);
        numList.add(12);
        numList.add(52);

        // Display the collection of elements from the list
        for (Integer integer : numList) {
            System.out.println(integer);
        }

        // Sort the elements of list
        Collections.sort(numList); //Collection.sort() are used to sort the list and return the Coollection of element in array
        System.out.println("Sort the list: " + numList);

        // Reverse the list of elements
        Collections.reverse(numList);
        System.out.print("Reverse the list: " +numList);

        // Collections.unmodifiableList() are used to make the list unmodifiable.
        Collections.unmodifiableList(numList);
        numList.add(43);
        numList.remove(0);

    }
}
