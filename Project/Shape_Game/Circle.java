package Shape_Game;

public class Circle extends TwoDShape {
   double radius;
      
   Circle(){


   }
   Circle(double radius){
    this.radius=radius;
   }
  @Override
   public void getArea(){
    Double  CircleArea = 3.14 * Math.pow(radius,2);
    System.out.println("The Area  of circle is :"+CircleArea);
   }
@Override
   public void  getPerimeter() {
     Double CirclePerimeter = 2*3.14*radius;
      System.out.println("The Perimeter of circle is :" +CirclePerimeter);
}
}