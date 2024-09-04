package TwoDArray;

public class TwodimensionArray {
    public static void main(String[] args) {
        // int[][] myArray = new int[row][col];   creation of new 2D array,It use when we need the value from user.

        int[][] myArray1 = { { 1, 2, 3 }, { 5, 6, 7 } };

        System.out.println(myArray1[0][0]); //first bracket  me row index and second bracket me column index likhate hai.
        System.out.println(myArray1.length); // Output = 2
        System.out.println(myArray1[0].length); // Output = 3


        // for change the value in 2D array
        myArray1[0][0] = 9;

        System.out.println(myArray1[0][0]);
    }
}