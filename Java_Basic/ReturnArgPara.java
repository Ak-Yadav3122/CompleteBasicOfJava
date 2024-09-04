package Java_Basic;
public class ReturnArgPara {
    public static void main(String[] args) {
        int result = returnSum(3,5); // the value which we pass when we call the methods thatt value called as arguments.
        System.out.println(result);
    }

    //creating or defing the new methods
    public static int returnSum(int first, int second) { // (int first, int second) these two are parameter. the value which we pass when we creting the methods that value called as parameter.
        int sum =  first + second;
        return sum ;
    }
}
 