package HouseHasABulb;

public class HouseDriver {
    public static void main(String[] args) {

        House h1 = new House();
        System.out.println("House object reference: " + h1);
        System.out.println("House object reference: " + h1.b1);
        h1.OpenGate();
        h1.b1.SwitchOn();
        h1.b1.SwitchOff();
        h1.CloseGate();

        House h2 = new House();
        h1 = h2;
        System.out.println("House object reference: " + h2);
        System.out.println("House object reference: " + h2.b1);
        h2.OpenGate();
        h2.b1.SwitchOn();
        h2.b1.SwitchOff();
        h2.CloseGate();

        // If we deleted the h1. Then we access the house by using reference h2 because we copy all the object of h1 in h2.
        h1 = null; // h1 = null helps us to delet the object of h1.
        h2.OpenGate();
        h2.b1.SwitchOn();
        h2.b1.SwitchOff();
        h2.CloseGate();

        // If we deleted the h2. Then we access the house by using reference h1.
        // h2 = null;
        // h1.OpenGate();
        // h1.b1.SwitchOn();
        // h1.b1.SwitchOff();
        // h1.CloseGate();



    }
}
