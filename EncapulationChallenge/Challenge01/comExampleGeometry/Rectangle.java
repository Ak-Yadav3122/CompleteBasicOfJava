package EncapulationChallenge.Challenge01.comExampleGeometry;

public class Rectangle {
    public int lenght;
    public int breadth;

    public Rectangle(){

    }

    public Rectangle(int lenght, int breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public float getAreaOfRectangle(int lenght, int breadth){
        float rectangleArea = lenght * breadth;
        return rectangleArea;
    }
}
