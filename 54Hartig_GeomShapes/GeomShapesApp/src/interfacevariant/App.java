package interfacevariant;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle r = new Rectangle(2, 3);
        Circle c1 = Circle.getInstanceD(4);
        Circle c2 = Circle.getInstanceR(3);

        System.out.println("3.varianta");
        ArrayList<AreaComputable> shapes3 = new ArrayList<>();
        shapes3.add(r);
        shapes3.add(c1);
        shapes3.add(c2);

        double allArea3 = 0;
        for (AreaComputable shape : shapes3) {
            allArea3 += shape.computeArea();
        }
        System.out.format("%.2f%n", allArea3);
    }
}
