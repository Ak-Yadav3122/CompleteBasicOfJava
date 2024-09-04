package Shape_Game;

public class Hemisphere extends ThreeDShape {
    double radius;

    Hemisphere() {

    }

    Hemisphere(double radius) {
        this.radius = radius;
    }
    

    @Override
    public void getVolume() {
        double HemoisphereVolume = 2 / 3 * Math.PI * (radius * radius * radius);
        System.out.println("The volume of the hemisphere is: " + HemoisphereVolume);
    }

    @Override
    public void getLateralSurfaceArea() {
        double HemispherelateralArea = 2 * (Math.PI * (radius * radius));
        System.out.println("The Lateral Surface Area of Hemisphere is :" + HemispherelateralArea);
    }

    @Override
    public void getTotalSurfaceArea() {
        double HemispheretotalArea = 3 * (Math.PI * (radius * radius));
        System.out.println("The Total Surface Area of Hemisphere is :" + HemispheretotalArea);
    }
}
