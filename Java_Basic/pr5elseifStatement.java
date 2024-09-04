package Java_Basic;
import java.util.Scanner;

public class pr5elseifStatement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x = sc.nextInt(); 
        System.out.print("Enter the value of y:");
        int y = sc.nextInt();
        System.out.print("Enter the value of z:");
        int z = sc.nextInt();
        if( x>y && x>z){
            System.out.println(x+" is greater than "+ y + " and "+z);
        }
        else if(y>z){
            System.out.println(y+" is greater than "+ x + " and "+z);
        }
        else{
            System.out.println(z+" is greater then "+ x + " and "+y);
        }
        sc.close();
    }
}
