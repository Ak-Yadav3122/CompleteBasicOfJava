package Java_Basic;
import java.util.Scanner;
public class pr4ifelseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x = sc.nextInt(); 
        System.out.print("Enter the value of y:");
        int y = sc.nextInt();
        if(x>y){
            System.out.println(x +" is greater than "+y);
        }
        else{
            System.out.println(y +" is greater than "+x);
        }
        sc.close();
    }
    
}
