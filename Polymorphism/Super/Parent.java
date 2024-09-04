package Polymorphism.Super;

public abstract class Parent {
    public String name;
    public int age;

    public Parent() {

    }

    public Parent(String name , int age) {
        this.name = name;
        this.age = age;
    }


    public void name(){
     System.out.println("your name is from parent class: "+ name);
    }
}
