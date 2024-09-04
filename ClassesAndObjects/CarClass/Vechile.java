package ClassesAndObjects.CarClass;

public class Vechile {
    String name;
    int price;
    float speed;
    String color;

    Vechile(){
        System.out.println("Vechile Object is created");
    }
    Vechile(String name){
        this();
        this.name = name;
    }
    Vechile(String name, int price){
        this(name);
        this.price = price;
    }
    Vechile(String name, int price,float speed){
        this(name,price);
        this.speed = speed;
    }

    // Vechile(String name,int price,float speed,String color){
    //     this(name, price,speed);
    //     // this.color = color;
    // }

    public void displayCar(){
        System.out.println("The Name of Vechicle is:"+ name);
        System.out.println("The Price of Vechicle is:"+ price);
        System.out.println("The Speed of Vechicle is:"+ speed);
    }


}
