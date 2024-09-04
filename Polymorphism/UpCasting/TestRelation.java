package Polymorphism.UpCasting;

public class TestRelation {
    public static void main(String[] args) {
        Parent parent = new Child(); // Upcasting concept are used
        System.out.println(parent);

       // Child child = (Child) new Parent(); //compile time error and Trying to downcast.
    }
}
