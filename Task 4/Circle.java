public class Circle implements Shape{

    double radiusLength;
   public Circle(double radiusLength){
       this.radiusLength=radiusLength;

   }
   public double getArea(){
       return 3.14 * (this.radiusLength * this.radiusLength);

   }
}
