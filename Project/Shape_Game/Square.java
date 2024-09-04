package Shape_Game;

public class Square extends TwoDShape {
    double side;

    Square() {

    }

    Square(double side) {
        this.side = side;
    }

    @Override
    public void getArea() {
        double SquareArea = side * side;
        System.out.println("The Area of the Square is: " + SquareArea);
    }

    @Override
    public void getPerimeter() {
        double SquarePerimeter = 4 * side;
        System.out.println("The Perimeter of the Square is: " + SquarePerimeter);
    }

}
