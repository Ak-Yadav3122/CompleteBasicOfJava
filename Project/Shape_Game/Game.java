package Shape_Game;

import java.util.Scanner;

public class Game {
    Game() {
        System.out.println("Wellcome to game");
        System.out.println("Game is now Started");
    }

    public int selectShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for 2-D Shape");
        System.out.println("Press 2 for 3-D Shape");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("You have selected 2-D Shape");
            return x;
        } else if (x == 2) {
            System.out.println("You have selected 3-D Shape");
            return x;
        } else {
            System.out.println("this is not a valid choice");
            System.out.println("plese select the right options");
            return selectShape(); // here we use recurision
        }

    }

    public TwoDShape selectTwoDShape() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for Circle");
        System.out.println("Press 2 for Ractangle");
        System.out.println("Press 3 for Triangle");
        System.out.println("Press 4 for Square");

        int UserChoice = sc.nextInt();

        switch (UserChoice) {
            case 1:
                System.out.println("You have selected circle");
                System.out.println("Enter the radius");
                double r = sc.nextDouble();
                Circle c1 = new Circle(r);
                return c1; // OR return new Circle(r)

            case 2:
                System.out.println("You have selected Ractangle");
                System.out.print("Enter the lenght of Rectangle:");
                double l = sc.nextDouble();
                System.out.print("Enter the width of Rectangle:");
                double b = sc.nextDouble();
                return new Ractangle(l, b);

            case 3:
                System.out.println("You have selected Triangle");
                System.out.print("Enter the first side of triangle:");
                double first = sc.nextDouble();
                System.out.print("Enter the second side of triangle:");
                double second = sc.nextDouble();
                System.out.print("Enter the third side of triangle:");
                double third = sc.nextDouble();
                return new Triangle(first, second, third);

            case 4:
                System.out.println("You have selected Square");
                System.out.println("Enter the value of side:");
                double side = sc.nextDouble();
                return new Square(side);

            default:
                System.out.println("This is not a right choice");
                System.out.println("Please select from right option");
                return selectTwoDShape();

        }

    }

    public ThreeDShape selectThreeDShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Cone");
        System.out.println("Press 2 for Cylinder");
        System.out.println("Press 3 for Cube");
        System.out.println("Press 4 for Hemisphere");
        System.out.println("Press 5 for Sphere");

        int UserChoice1 = sc.nextInt();

        switch (UserChoice1) {
            case 1:
                System.out.println("You have selected Cone");
                System.out.println("Enter the radius");
                double r = sc.nextDouble();
                System.out.println("Enter the height");
                double h = sc.nextDouble();
                Cone co1 = new Cone(r, h);
                return co1;

            case 2:
                System.out.println("You have selected Cylinder");
                System.out.println("Enter the radius");
                double ra = sc.nextDouble();
                System.out.println("Enter the height");
                double hi = sc.nextDouble();
                Cylinder cy1 = new Cylinder(ra, hi);
                return cy1;

            case 3:
                System.out.println("You have selected Cube");
                System.out.println("The side length  of cube is : ");
                double s = sc.nextDouble();
                Cube cu = new Cube(s);
                return cu;

            case 4:
                System.out.println("You have selected HemiSphere");
                System.out.println("Enter the radius");
                double R = sc.nextDouble();
                Hemisphere he1 = new Hemisphere(R);
                return he1;

            case 5:
                System.out.println("You have selected Sphere");
                System.out.println("Enter the radius");
                double re = sc.nextDouble();
                Sphere sp1 = new Sphere(re);
                return sp1;

            default:
                System.out.println("This is not a right choice");
                System.out.println("Please select from right option");
                return selectThreeDShape();

        }
        
    }
   

}
