package Java_Basic;

import java.util.*;
public class pr2arthimatic {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n : ");
         int n = sc.nextInt();
         System.out.print("Enter the value of m : ");
         int m = sc.nextInt();
         System.out.println("the final output of n amd m are: "+ (n+m));
         System.out.println("the final output of n amd m are: "+ (n-m));
         System.out.println("the final output of n amd m are: "+ (n*m));
         System.out.println("the final output of n amd m are: "+ (n/m));
         System.out.println("the final output of n amd m are: "+ (n%m));
         sc.close();
    }
}

