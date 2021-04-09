package inherritancevariant;

public abstract class Shape {
    protected String name = "Geometric shape";
    
    public abstract double computeArea();

    public String getSimpleName() {
        return this.getClass().getSimpleName();
    }
}