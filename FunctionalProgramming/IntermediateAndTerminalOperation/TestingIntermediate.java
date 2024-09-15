package FunctionalProgramming.IntermediateAndTerminalOperation;

import java.util.List;
import java.util.stream.Collectors;

public class TestingIntermediate {
    public static void main(String[] args) {

        // Sorted() are used to sort the list of number
        List<Integer> number = List.of(4,6,3,2,9,7);
        List<Integer> sortedNumber = number.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumber);
 
        //Distinct() are used to filters the duplicate elements
        List<String> items = List.of("Apple","Mango","Apple","Bnanana","PineApple","Mango");
        List<String> distinctItem = items.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctItem);

        /*
        Map() are used for applies a function to each elements of a stream, 
        Transforming them into neew stream of results based on the function.
         */

        List<String> words = List.of("aichchhik" ,"yadav","From Azamgarh");
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseWords);
    }
}

// Intermediate Operation like Sort(),  Distinct(), Map()
