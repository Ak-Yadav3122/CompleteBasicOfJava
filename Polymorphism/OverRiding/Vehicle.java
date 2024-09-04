package Polymorphism.OverRiding;

public  class Vehicle {
    public  String name;
    public  int price;


    public  Vehicle(){

    }
    public Vehicle(String name, int price) {
        this.name = name;
        this.price=price;
    }

    public  int getPrice(){
        return this.price;
    }
    public  void start(){
        System.out.println("Vehicle is starting");
    }
}
