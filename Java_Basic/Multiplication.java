package Java_Basic;

import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = sc.nextInt();
        getMultiplication(number);
        sc.close();
    }

    public static void getMultiplication(int num) {
        int i = 1;

       while(i<=10){
        int multi = i * num;
        System.out.println(num + " X " + i +" = "+ multi);
        i++;
       }

    }
}
