package Shape_Game;

public class Cube extends ThreeDShape {
    double sideLength;

    Cube() {

    }

    Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void getVolume() {
        System.out.println("The volume of the cube is: " + (Math.pow(sideLength, 3)));
    }

    @Override
    public void getLateralSurfaceArea() {
        System.out.println("The Lateral Surface area of the cube is: " + 4 * (Math.pow(sideLength, 2)));
    }
    @Override
    public void getTotalSurfaceArea(){
        double  totalSurfaceArea=6*(Math.pow(sideLength, 2));
        System.out.println("The Total Surface Area of the cube is: "+totalSurfaceArea);
        
    }
}
