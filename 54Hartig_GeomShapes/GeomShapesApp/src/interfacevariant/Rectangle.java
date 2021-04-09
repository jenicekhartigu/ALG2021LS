package interfacevariant;

public class Rectangle implements AreaComputable{
    
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle [a=" + a + ", b=" + b + "]";
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double calculateArea() {
        return a*b;
    }
    
    @Override
    public double computeArea() {
        return calculateArea();
    }

}
