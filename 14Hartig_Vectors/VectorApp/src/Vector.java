import java.util.concurrent.atomic.AtomicInteger;

public class Vector {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private float x;
    private float y;
//Konsturktory
    public Vector() {
        setX(0);
        setY(0);
        id = count.incrementAndGet();
    }

    public Vector(float aX, float aY) {
        setX(aX);
        setY(aY);
        id = count.incrementAndGet();
    }
//Gettry Settry
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
//ToString
    public String toString() {
        return "vec" + id +" [" + getX() + ";" + getY() + "]";
    }
//Fce pro sečtení dvou vektoru
    public String sumVec(Vector vec2) {
        float resx;
        float resy;
        resx = this.getX() + vec2.getX();
        resy = this.getY() + vec2.getY();
        return "sumVec "+ this.id +" a "+ vec2.id + " [" + resx + ";" + resy + "]";
    }
//Fce pro zvětšení vektoru
    public void expandVec(float cis){
        this.setX(this.getX()*cis);
        this.setY(this.getY()*cis); 
    }
    
}
