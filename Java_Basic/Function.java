package Java_Basic;
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String greeting = sc.nextLine();
        System.out.print(greeting + ", ");
        greeting(); // calling of greeting methods
        sc.close();

    }

    // defing a new function or methods without any return statement so we use void as a place of return statement. 
    public static void greeting() {
        System.out.println("Good Morning From Coading Worlds....");
}
}