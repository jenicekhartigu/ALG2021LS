import java.util.Arrays;

public class Polynomial {
    //5x^2 + 4x + 1 
    private double[] coefR;

    private Polynomial(double[] coefR) {
        this.coefR = Arrays.copyOf(coefR, coefR.length);
        
    }

    public static Polynomial getInstance(double...coef) {
        double[] coefR = new double[coef.length];
        for (int i = 0 ; i< coefR.length ; i++) {
            coefR[i] = coef[coef.length - 1 - i];
        }
        return new Polynomial(coefR);
    }

    public static Polynomial getInstanceRev(double...coefR) {
        return new Polynomial(coefR);
    }

    public Polynomial derivate() {
        double[] derPoleR = new double[this.coefR.length - 1];
        for(int i = 0; i < derPoleR.length; i++) {
            derPoleR[i] = this.coefR[i+1] * (i+1);
        }
        return new Polynomial(derPoleR);
    }

    //defenzivni kopie
    public double[] getAllCoefR() {
        return Arrays.copyOf(coefR, coefR.length);
    }

    @Override
    public String toString() {
        return "Polynomial [coefR=" + Arrays.toString(coefR) + "]";
    }

    

}