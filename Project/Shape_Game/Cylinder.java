package Shape_Game;
public class Cylinder extends ThreeDShape {
    double  radius, height;
    Cylinder(){

    }
    Cylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
    }

@Override
    public void getLateralSurfaceArea(){
        double  CylinderlateralArea=2 * Math.PI * radius * height ;
        System.out.println("The Lateral Surface Area of the cylinder is :" +CylinderlateralArea);
    }
@Override
    public void getTotalSurfaceArea(){
        double  CylindertotalArea=  2*Math.PI*(radius*height + radius*radius);
        System.out.println("The Total Surface Area of the cylinder is :" +CylindertotalArea);
    }
}
