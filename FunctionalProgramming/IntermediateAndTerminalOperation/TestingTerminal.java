package FunctionalProgramming.IntermediateAndTerminalOperation;


import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TestingTerminal {
    public static void main(String[] args) {

        // to find the max number in given number list
        List<Integer> number = List.of(4,6,3,7,2,9);
        //By using Optional Class
        Optional<Integer> maxNumber = number.stream().max(Integer::compareTo);
        maxNumber.ifPresent(System.out::println); 
        
        /*
        For using simple print statement we have an optional Output so we use Optional class to ignore NullPointerException
        which occured in casew when  list is empty.
        */
        System.out.println(maxNumber); //Output => Optional[9]

        //To find min number in given number list
        List<Integer> number2 = List.of(4,5,3,6,2,9);
        Optional<Integer> minNum = number2.stream().min(Integer::compareTo);
        minNum.ifPresent(System.out::println);

        // use of collect(collectors.toList())
       //collect(collectors.toList()) is used to collect all the elements of stream into a new List

        List<String> words = List.of("Stream", "Operation","Java");
        //By using lIST
        List<String> collectedWords =words.stream().collect(Collectors.toList());
        System.out.print(collectedWords);

        //By using SET
        Set<String> collectedSet = words.stream().collect(Collectors.toSet()); 
        System.out.print(collectedSet);


    }
}
// Terminal Opertions like max(),min(),collect(Collectos.toList()),collect(Collectos.toSet())