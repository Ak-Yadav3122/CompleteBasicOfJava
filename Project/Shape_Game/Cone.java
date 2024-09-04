package Shape_Game;

public class Cone extends ThreeDShape {
    double radius, height;

    Cone() {

    }

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void getVolume(){
        double ConeVolume = 1/3 * (3.14 * (Math.pow(radius, 2) * height));
        System.out.println("The volume  of the cone is: " + ConeVolume);
    }
    
@Override
    public void getLateralSurfaceArea() {
        double ConeLateralArea = 3.14 * radius * height;
        System.out.println("The Lateral Surface Area of Cone is: " + ConeLateralArea);
    }
@Override
    public void getTotalSurfaceArea() {
        double ConeTotalarea = (3.14*(radius*radius + radius*height));
        System.out.println("The Total Surface Area of Cone is: " + ConeTotalarea);
    }
}
