public class Square implements Shape {

    double radiusLength;

    public Square(double radiusLength) {
        this.radiusLength = radiusLength;
    }

    public double getArea() {
        return this.radiusLength * 2;
    }
}