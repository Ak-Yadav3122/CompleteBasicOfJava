package EncapulationChallenge.GetterSetter;

public class CarDriver {
    public static void main(String[] args) {

        Car swift = new Car("Red", "Swift", 300000);
        System.out.println("Your car details are: \n" + swift);

        System.out.println(swift.getColor());
        System.out.println(swift.setColor("blue"));

        System.out.println(swift.getModel());
        System.out.println(swift.setModel("Maruti"));

        System.out.println(swift.getPrice());
        System.out.println(swift.setPrice(74667564));

        System.out.println("Your car details are After modification: \n" + swift);

    }
}
