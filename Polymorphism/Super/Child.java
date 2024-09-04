package Polymorphism.Super;

public class Child extends Parent{


    public Child(String name, int age) {
    this.name= name;
    this.age = age;
    }

    @Override
    public void name(){
        super.name();
        System.out.println("your name is from child class: "+ name);
    }
}
