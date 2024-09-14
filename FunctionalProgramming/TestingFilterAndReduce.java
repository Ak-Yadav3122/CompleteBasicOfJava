package FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
 

public class TestingFilterAndReduce {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple","Mango","Oraange","Grapes","WaterMelon");
        System.out.println(fruits.size()); //To know thw size of list.

        System.out.println("Printing fruits normally: ");
        //for knowing all the list member
        for (String stringFruit : fruits) {
            System.out.println(stringFruit);
            
        }

        //By using Stream we also get the list of all member
        System.out.println("Printing fruits by using Streams: ");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruitList) {
                System.out.println(fruitList);
            }
        });

        //By using lambda expresion
        System.out.println("Printing fruits by using Lambda Expression: ");
        fruits.stream()
        .filter(fruit -> fruit.endsWith("e"))
        .forEach(fruit -> System.out.println(fruits));
    }
}
