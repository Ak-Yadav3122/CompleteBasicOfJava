package Shape_Game;

public class Triangle extends TwoDShape {
    double side1, side2, side3; // sides of the triangle
    double base;
    double height;

    Triangle() {

    }

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of Triangle is: " + area + " Sq. Unit");
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of Triangle is: " + (side1 + side2 + side3) + " Unit");
    }

}
