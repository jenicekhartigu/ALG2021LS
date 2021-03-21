import java.util.Arrays;

public class Polynomial {
    // 5x^2 + 4x + 1
    private double[] coefR;
    private int stupen = 0;

    private Polynomial(double[] coefR) {
        this.coefR = Arrays.copyOf(coefR, coefR.length);
        this.stupen = coefR.length - 1;
    }

    public static Polynomial getInstance(double... coef) {
        double[] coefR = new double[coef.length];
        for (int i = 0; i < coefR.length; i++) {
            coefR[i] = coef[coef.length - 1 - i];
        }
        return new Polynomial(coefR);
    }

    public static Polynomial getInstanceRev(double... coefR) {
        return new Polynomial(coefR);
    }

    public Polynomial derivate() {
        double[] derPoleR = new double[this.coefR.length - 1];
        for (int i = 0; i < derPoleR.length; i++) {
            derPoleR[i] = this.coefR[i + 1] * (i + 1);
        }
        return new Polynomial(derPoleR);
    }

    // defenzivni kopie
    public double[] getAllCoefR() {
        return Arrays.copyOf(coefR, coefR.length);
    }

    public int getStupen() {
        return stupen;
    }

    public double getCoefAtIndex(int cislo) {
        if (cislo < stupen) {
            double coef = coefR[Math.abs(cislo-stupen)];
        return coef;
        }
        System.out.println("Tak vysoky koeficient v polynomu neni");
        return 0;
        
    }

    public double hornerValue(int x) {
        double result = coefR[0];
        for (int i = 1; i < this.coefR.length; i++) {
            result = result * x + coefR[i];
        }
        return result;
    }

    public String polyString() {
        String result = "";
        for(int i = 0; i < this.coefR.length; i++) {
            if (i == this.stupen) {
                result += coefR[i];
            } else {
                if(coefR[i] > 0){
                    result += coefR[i] + "x^" + (this.stupen - i) + " + "; 
                }
                result += "";
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Polynomial [coefR=" + Arrays.toString(coefR) + "]";
    }

}