package EngineHasACar;

public class Engine {
   int HorsePower;
   String ModalNumber;
   int Speed;

    Engine(){

    }


    Engine(int HorsePower, String ModalNumber, int Speed){
        this.HorsePower = HorsePower;
        this.ModalNumber = ModalNumber;
        this.Speed = Speed;
    }

    public void displayEngine(){
        System.out.println("The HorsePower of Car is: "+ HorsePower);
        System.out.println("The ModalNumber of Car is: "+ ModalNumber);
        System.out.println("The Speed of Car is: "+ Speed);
    }

}
