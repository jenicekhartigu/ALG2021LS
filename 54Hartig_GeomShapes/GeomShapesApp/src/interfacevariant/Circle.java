package interfacevariant;

public class Circle implements AreaComputable{
    private double r;
    //consturctor skrz tovarni metody
    private Circle(double r){
        this.r = r;
    }
    public static Circle getInstanceR(double r) {
        return new Circle(r);
    }
    public static Circle getInstanceD(double d) {
        return new Circle(d/2);
    }

    //getter
    public double getR() {
        return r;
    }
    
    @Override
    public String toString() {
        return "Circle [r=" + r + "]";
    }

    public double getArea(){
        return Math.PI*(r*r);
    }

    @Override
    public double computeArea(){
        return getArea();
    }

    public static void main(String[] args) {
        Circle c = Circle.getInstanceD(2);
        System.out.println(c.getArea());
        c.toString();
    }
}
