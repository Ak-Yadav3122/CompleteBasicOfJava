package Java_Basic;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Wellcome " + name);
        System.out.print(name + ",Please tell me your age: ");
        int age = sc.nextInt();
        System.out.println("Hello "+ name +" Your age is: "+age);
        sc.close();
    }
}
