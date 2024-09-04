package InheritanceChallenge.Interface.ShapeProject;

public class TestShape {
    public static void main(String[] args) {
//        Shape shape = new Shape(); // 'Shape' is abstract so we can not define its objects.

        Circle circle = new Circle(3);
        System.out.println("Area of circle is: "+circle.calculateArea());

        Square square = new Square(4);
        System.out.println("Area of square is: "+square.calculateArea());
    }
}
