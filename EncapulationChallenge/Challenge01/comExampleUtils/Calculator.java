package EncapulationChallenge.Challenge01.comExampleUtils;

import EncapulationChallenge.Challenge01.comExampleGeometry.Circle;
import EncapulationChallenge.Challenge01.comExampleGeometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle();
        double resultOfCircle = Math.round(cir.getAreaOfCircel(6));
        System.out.println("Area of Rectangle is: " + resultOfCircle);

        Rectangle rec = new Rectangle();
        float resultOfRectangle = rec.getAreaOfRectangle(10, 5);
        System.out.println("Area of Rectangle is: " + resultOfRectangle);
    }
}
