package ARRAY;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wellcome to Array Worlds...");
        System.out.print("Please enter the value which you want to search: ");
        int value = sc.nextInt();
        if (getArray(value)) {
            System.out.println("Your value is: " + value);
        } else {
            System.out.println("Sooooooooooooorry, \nYour value is not in Array list.");
        }
        sc.close();
    }

    public static boolean getArray(int val) {
        int[] myArray = { 1, 2, 4, 5, 7, 8 };

        int index = 0;
        while (index < myArray.length) {
            if (myArray[index] == val) {
                System.out.println("We get your value, At Index: " + index);
                return true;
            }
 
            index++;
        }

        return false;

    }
}
