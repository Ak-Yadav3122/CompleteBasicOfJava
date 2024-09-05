package Polymorphism.Overloading;

public class Constructor_Overloading {

    // Jo class ka name hoga use name se constuctor banega.
    // In constructor overloading there is multiple constructor with same name, but they have different parameter.
    // Overload constructor must be differed in the number,type,oe sequence of their parameter.

    Constructor_Overloading(){
        System.out.println("Default constructor call");
    }
    Constructor_Overloading(int a,int b){
        int resultOfTwo = a+b;
        System.out.println((resultOfTwo));
    }
    Constructor_Overloading(String firstName , String LastName){
        String resultOfTwoString = firstName + LastName ;
        System.out.println((resultOfTwoString));
    }


    public static void main(String[] args) {
        Constructor_Overloading defaultConstructor  = new Constructor_Overloading();

        Constructor_Overloading sumConstructor = new Constructor_Overloading(2,5);

        Constructor_Overloading stringConstructor = new Constructor_Overloading("Aichchhik ", "Kumar");
    }
}
