public class Fraction {
    private double citatel;
    private double jmenovatel;

    // CONSTRUCTOR
    // --------------------------------------------------------------------------------
    public Fraction() {
        setCit(0);
        setJme(0);
    }

    public Fraction(double aCitatel, double aJmenovatel) {
        setCit(aCitatel);
        setJme(aJmenovatel);
    }

    // GETTERY SETTERY
    // ----------------------------------------------------------------------------
    public void setCit(double citatel) {
        this.citatel = citatel;
    }

    public void setJme(double jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

    public double getCit() {
        return citatel;
    }

    public double getJme() {
        return jmenovatel;
    }

    // FUNKCE
    // -------------------------------------------------------------------------------------

    public String isValid() {
        if (this.getJme() == 0) {
            return "\n- Nefunkcni zlomek, nelze delit nulou\n";
        }
        return "\n";
    }

    public String toString() {
        return this.getCit() + " " + this.getJme() + this.isValid();
    }

    public double getValue() {
        double res;
        if (this.getJme() == 0) {
            return 0;
        }
        res = this.getCit() / this.getJme();
        return res;
    }

    public String prntFrac() {
        return this.getCit() + "/" + this.getJme() + this.isValid();
    }

    public String prntFracNice() {
        String cit = String.valueOf(this.getCit());
        String jme = String.valueOf(this.getJme());
        int lenCit = cit.length();
        int lenJme = jme.length();
        int divLineLen = Math.max(lenCit, lenJme);
        String divLine = "";
        for (int i = 0; i < divLineLen; i++) {
            divLine += "_";
        }
        return this.getCit() + "\n" + divLine + "\n" + this.getJme() + this.isValid();
    }
}
