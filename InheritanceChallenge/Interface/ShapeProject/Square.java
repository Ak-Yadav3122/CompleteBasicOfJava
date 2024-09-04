package InheritanceChallenge.Interface.ShapeProject;

public class Square extends Shape {

    public final double sideOfSquare;

    public Square(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }


    public double getSideOfSquare() {
        return sideOfSquare;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideOfSquare,2);
    }
}
