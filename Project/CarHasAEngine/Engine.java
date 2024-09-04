package CarHasAEngine;

public class Engine {
    int HorsePower;
    int strokes;
    String type;
    int speed;

    Engine() {

    }

    Engine(int HorsePower, int strokes, String type , int speed) {
        this.HorsePower = HorsePower;
        this.strokes = strokes;
        this.type = type;
        this.speed = speed;
    } 
    Engine(int HorsePower, int strokes, String type) {
        this.HorsePower = HorsePower;
        this.strokes = strokes;
        this.type = type;
    }

    public void Start() {
        System.out.println("Start the Engine");
    }

    public void displayEngine() {
        System.out.println("HoursePower is: " + HorsePower);
        System.out.println("Strokes is: " + strokes);
        System.out.println("Type is: " + type);
        System.out.println("Speed is: " + speed);
        System.out.println();
    }
}
