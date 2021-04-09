package inherritancevariant;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle r = new Rectangle(2, 3);
        Circle c1 = Circle.getInstanceD(4);
        Circle c2 = Circle.getInstanceR(3);

        System.out.println("1.varianta");
        double allArea1 = r.calculateArea() + c1.getArea() + c2.getArea();
        System.out.format("%.2f%n", allArea1);

        System.out.println("2.varianta");
        ArrayList<Object> shapes2 = new ArrayList<>();
        shapes2.add(r);
        shapes2.add(c1);
        shapes2.add(c2);
        double allArea2 = 0;
        for (Object object : shapes2) {
            if(object instanceof Rectangle){
                allArea2 += ((Rectangle)object).calculateArea();
            } else if (object instanceof Circle) {
                allArea2 += ((Circle)object).getArea();
            }
        }
        System.out.format("%.2f%n",allArea2);

        System.out.println("3.varianta");
        ArrayList<Shape> shapes3 = new ArrayList<>();
        shapes3.add(r);
        shapes3.add(c1);
        shapes3.add(c2);
        shapes3.add(new Triangle());
        
        double allArea3 = 0;
        for (Shape shape : shapes3) {
            System.out.println(shape.getSimpleName());
            allArea3 += shape.computeArea();
        }
        System.out.format("%.2f%n", allArea3);
    }
}
