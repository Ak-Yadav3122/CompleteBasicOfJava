package CollectionAndGenerics.CollectionsLibrary.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
         

   //  List<String> means we have a String list and we can not add a integer in the String list. ex:  strlist.add(34);
   //  We have to mention the datatype of list by using <> brackets

       List<String> strlist = new ArrayList<String>(); //  <> --- It is generic type and it exits only on compile time. 
       strlist.add("Aichchhik");// .add() is ussed to add the new element in the list.
       strlist.add("Yadav");
       strlist.add(1,"Kumar");
       strlist.remove(1); //.remove() is used to remove the element from list.

       //By using for loop
       for (int i = 0; i < strlist.size(); i++) {
        System.out.println(strlist.get(i));
       }

       //by using forEach loop
       for (String str : strlist) {
        System.out.println(str);
       }


       System.out.print(strlist.indexOf("Kumar")); //.indexOf is used to find the index of elements from the list.
    }
}
