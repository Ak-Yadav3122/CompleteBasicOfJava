package Polymorphism.OverRiding;

 class Car extends Vehicle{
     public Car(){

     }
     public Car(String name, int price) {
        super(name, price);
     }

     @Override
     public void start() {
         System.out.println("Car is running");
     }
 }
