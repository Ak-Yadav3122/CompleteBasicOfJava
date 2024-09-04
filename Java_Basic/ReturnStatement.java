package Java_Basic;
public class ReturnStatement {
    public static void main(String[] args) {
       printPattern(); //calling of new method i.e; printPattern()
    }

    // a new methods to print the simple star sequence
    public static void printPattern() {
        System.out.println("Print Stars Patter");
        int row = 0;
        while (row < 7) {
            System.out.print("*");
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }

            row++;
            System.out.println();
        }

    }
}
