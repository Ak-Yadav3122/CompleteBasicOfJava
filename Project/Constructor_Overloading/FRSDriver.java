package Constructor_Overloading;
// import java.util.*;

public class FRSDriver {
    public static void main(String[] args) {

        // for student class

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.name = "Ayush";
        s1.age = 22;
        s1.rollnumber = 100020;
        s2.name = "Ajay";
        s2.age = 21;
        s2.rollnumber = 100010;
        s3.name = "Rahul";
        s3.age = 23;
        s3.rollnumber = 100026;
        s4.name = "Abhishek";
        s4.age = 24;
        s4.rollnumber = 100006;
        System.out.println("Students Dtails are:======");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollnumber);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollnumber);
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.rollnumber);
        System.out.println(s4.name);
        System.out.println(s4.age);
        System.out.println(s4.rollnumber);

        // For Fruit class

        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        Fruit f3 = new Fruit();
        Fruit f4 = new Fruit();
        f1.name = "Apple";
        f1.price = 125;
        f2.name = "Banana";
        f2.price = 50;
        f3.name = "Grapse";
        f3.price = 140;
        f4.name = "Gauava";
        f4.price = 75;
        System.out.println("The Fruit details are:========");
        System.out.println(f1.name);
        System.out.println(f1.price);
        System.out.println(f2.name);
        System.out.println(f2.price);
        System.out.println(f3.name);
        System.out.println(f3.price);
        System.out.println(f4.name);
        System.out.println(f4.price);

        // for rectange class

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        Rectangle r4 = new Rectangle();
        r1.length = 23;
        r1.bridth = 32;
        r2.length = 13;
        r2.bridth = 22;
        r3.length = 25;
        r3.bridth = 22;
        r4.length = 26;
        r4.bridth = 82;
        System.out.println("The Rectangle details are:=========");
        System.out.println(r1.length);
        System.out.println(r1.bridth);
        System.out.println(r2.length);
        System.out.println(r2.bridth);
        System.out.println(r3.length);
        System.out.println(r3.bridth);
        System.out.println(r4.length);
        System.out.println(r4.bridth);

    }
}
