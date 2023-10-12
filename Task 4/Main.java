public class Main {

    public static void main(String [] args){

    Circle c1 = new Circle(10.5);

        System.out.println(c1.getArea());

    Square a1 = new Square(25.5);

        System.out.println(a1.getArea());

        ShapeBuilder s1 = new ShapeBuilder();
        s1.addShape(c1);
        s1.addShape(a1);

        System.out.println(s1.totalArea());
    }
}
