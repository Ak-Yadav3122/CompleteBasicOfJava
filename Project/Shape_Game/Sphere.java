package Shape_Game;

public class Sphere extends ThreeDShape {
    double radius;

    Sphere() {

    }

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void getVolume() {
        double sphereVolume = 4 / 3 * (Math.PI * (radius * radius * radius));
        System.out.println("The volume of Sphere is: " + sphereVolume);
    }

    @Override
    public void getLateralSurfaceArea() {
        double SphereLateralArea = (4 * Math.PI) * (radius * radius);
        System.out.println("The Lateral Surface Area of The Sphere is: " + SphereLateralArea);
    }

    @Override
    public void getTotalSurfaceArea() {
        double SphereTotalArea = (4 * Math.PI) * (radius * radius);
        System.out.println("The Total Surface Area of The Sphere is:" + SphereTotalArea);
    }
}
