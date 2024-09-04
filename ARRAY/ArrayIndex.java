package ARRAY;
public class ArrayIndex {
    public static void main(String[] args) {
        //int[] myarr = new int[10]; // creation of new array with size 10 when we need the value from user.
        int[] arr= {2,4,5,6,7,8};  // Initialization of values when we put the value in array by self.
      
        System.out.println(arr.length);
        System.out.println(arr[2]);  // output = 5

        //change the value at the array index

        arr[2]=9; 
        System.out.println(arr[2]); //output =9 because we change the value at index 2.
    }
}

// Index in Array means position of number - 1;
// Position in Array means Index of number + 1;
// Array length  = array last index +1;