package CollectionAndGenerics.CollectionsLibrary.Collection;
import java.util.*;
public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        //.add are used to add the elemtent in the set
        set.add("Aichchhik");
        set.add("Abhay");
        set.add("Sumit");
        set.add("Abhishek");
         
        //to show all th collection of set
        for (String string : set) {
            System.out.println(string);   
        }

        //.remove are used to remove the elements from the set
        set.remove("Sumit");

        //.size() is used to find the size of set
        System.out.println(set.size());
    }
}
