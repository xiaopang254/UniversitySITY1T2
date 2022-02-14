package Q2;

public class Main {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);

        Shape figref;
        figref = r;
        System.out.println("Inside Area for Rectangle. \nArea is " + String.format("%.2f", figref.area()));

        figref = t;
        System.out.println("Inside Area for Triangle. \nArea is " + String.format("%.2f", figref.area()));

        figref = c;
        System.out.println("Inside Area for Circle. \nArea is " + String.format("%.2f", figref.area()));

        figref = e;
        System.out.println("Inside Area for Ellipse. \nArea is " + String.format("%.2f", figref.area()));

        figref = s;
        System.out.println("Inside Area for Circle. \nArea is " + String.format("%.2f", figref.area()));

    }

}
