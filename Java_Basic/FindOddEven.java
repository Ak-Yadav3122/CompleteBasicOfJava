package Java_Basic;

import java.util.*;

public class FindOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = sc.nextInt();
        oddNumber(num); 
        oddnumber(num);
        sc.close();

    }
        // By using Switch Statement

        public static void oddNumber(int value){
            int result = value % 2;
        switch (result) {
            case 0:
                System.out.println(" You enter Even number");
                break;
            case 1:
                System.out.println("You Enter a odd number");
                break;
            default:
                System.out.println("You Put a InValid Number");
                break;
        }  
    }
      

        //By using ternary Operator
 
        public static void oddnumber(int value){

            String result = value % 2 ==0 ? "Even" :"Odd";

            System.out.println("Your number is: "+ result);
            
        }

      
    }
