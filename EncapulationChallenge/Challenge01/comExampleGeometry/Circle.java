package EncapulationChallenge.Challenge01.comExampleGeometry;

public class Circle {
    public double radius;

    public Circle(){
        
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getAreaOfCircel(double radius){
        double circleArea = Math.PI *Math.pow(radius,2);
        return circleArea;
    }
}
