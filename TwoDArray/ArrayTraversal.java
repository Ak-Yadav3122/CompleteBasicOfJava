package TwoDArray;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Array Traversal Logic
        int i = 0;
        while (i < myArray.length) { // This first loop are outerloop, run for the { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            int j = 0;
            while (j < myArray[i].length) { // this second loop are the inner loop run for the {1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
                System.out.print(myArray[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
