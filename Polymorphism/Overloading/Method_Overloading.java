package Polymorphism.Overloading;

public class Method_Overloading {


    // In method overloading there is multiple method with same name, but they have different parameter.
    // Overload method must be differed in the number,type,oe sequence of their parameter.

    public int sum(int a, int b){
        return  a+b;
    }

    public int sum(int a,int b,int c){
        return a+b+c;
    }

    public int sum(int a,int b,int c,int d){
        return  a+b+c+d;
    }
    public String sum(String firstName, String secondName){
        return  firstName + secondName;
    }

    public static void main(String[] args) {
        Method_Overloading overloading = new Method_Overloading(); //class ka he object banta hai.

        int resultOfTwo =  overloading.sum(3,5);  //object ke reference se method call hota hai
        System.out.println(resultOfTwo);

        String resultOfTwoString = overloading.sum("Aichchhik ","Kumar");
        System.out.println(resultOfTwoString);

        int resultOfThree = overloading.sum(5,8,9);
        System.out.println(resultOfThree);


        int resultOfFour = overloading.sum(3,5,2,6);
        System.out.println(resultOfFour);
    }
}
