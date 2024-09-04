package InheritanceChallenge.ForUnderstanding;

public class TwoWeeler extends Vechile {

    protected TwoWeeler() {
        noOfTires = 2;
    }

    TwoWeeler(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    TwoWeeler(String color) {
        this.color = color;
    }

    public void balance() {
        System.out.println("I am balancing vechile");
    }
}
