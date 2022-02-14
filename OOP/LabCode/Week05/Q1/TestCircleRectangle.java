package Q1;

public class TestCircleRectangle {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("white");
        circle.setFilled(false);
        circle.setRadius(1);
        circle.printCircle();
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is: " + circle.getRadius());
        System.out.println("The area is: " + circle.getArea());
        System.out.println("The diameter is: " + circle.getDiameter());

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(4);
        rectangle.setWidth(2);
        rectangle.setColor("white");
        rectangle.setFilled(false);
        rectangle.printRectangle();
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

    }
}