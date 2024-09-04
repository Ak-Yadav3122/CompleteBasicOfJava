package Java_Basic;

import java.util.*;;

public class AbsoluteNum { // Absolute number means; (num = num )or (-num = num)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number :");
        int num = sc.nextInt();
        getAbsolute(num);
        sc.close();

    }

    public  static void getAbsolute(int value) {
        int result = value >= 0 ? value : -value;
        System.out.println("Your Absolute value is: "+result);

    }
}
