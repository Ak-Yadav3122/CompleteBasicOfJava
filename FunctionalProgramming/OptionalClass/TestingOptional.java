package FunctionalProgramming.OptionalClass;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        Optional<Integer> number2 = numbers.stream()
        .reduce((a,b)->a+b);

        if(number2.isPresent()){
            System.out.println(number2.get());
        }
        else{
            System.out.println("List is empty");
        }

        //Creating the optional object

        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalOf = Optional.of("Java");
        Optional<String> optionalNullable = Optional.ofNullable(null);
        System.out.println(optionalNullable);

        if(optionalOf.isPresent()){
            System.out.println("Value is present: "+ optionalOf.get());
        }


        String name = optionalEmpty.orElse("Default Value");
        System.out.println("optinal value:"+ name);
    }
    
}
