package FunctionalProgramming.LambdaExpression.MethodReference;
import java.util.List;

public class TestOfMethodReference {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9);

        //By using method reference syntax i.e; ::(double colon)

        number.stream()
        .filter(num -> num % 2 != 0)
        .forEach(System.out::println);


        
        //without method reference
        number.stream()
        .filter(num ->num%2 == 0)
        .forEach(num ->System.out.println(num));


    }
}
