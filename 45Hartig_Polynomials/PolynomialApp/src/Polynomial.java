import java.util.Arrays;

public class Polynomial {
    //5x^2 + 4x + 1 
    private double[] coefR;

    private Polynomial(double[] coefR) {
        this.coefR = Arrays.copyOf(coefR, coefR.length);
        
    }
    /*
    public Polynomial(double[] c, boolean reverted) {
        if(reverted) {
            this.coefR = Arrays.copyOf(c, c.length);
        } else {
            double[] coefR = new double[c.length];
            for (int i = 0 ; i< coefR.length ; i++) {
                coefR[i] = c[c.length - 1 - i];
            }
            this.coefR = coefR;
        }
    }
    */
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


    @Override
    public String toString() {
        return "Polynomial [coefR=" + Arrays.toString(coefR) + "]";
    }

    

}