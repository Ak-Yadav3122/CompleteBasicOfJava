package Shape_Game;

public class Ractangle extends TwoDShape {
    double Length;
    double Width;

    Ractangle() {

    }

    Ractangle(double Length, double Width) {
        this.Length = Length;
        this.Width = Width;
    }

    public void getLength() {
        System.out.print(" Enter the Length of Ractangle:" + Length);
    }

    public void getWidth() {
        System.out.print("Enter the width of Ractangle is:" + Width);
    }

    public void getArea() {
        double RactangleArea = Length * Width;
        System.out.println("\n The area of the Rectangle is: " + RactangleArea);
    }

    public void getPerimeter() {
        double RactanglePerimeter = 2 * (Length + Width);
        System.out.println("The  perimeters of the Rectangle is: " + RactanglePerimeter);

    }
}
