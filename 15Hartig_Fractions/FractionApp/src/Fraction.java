public class Fraction {
    private double citatel; // > this.zlomek[0]
    private double jmenovatel; // > this.zlomek[1]

    //private double zlomek[]  = new double [2];

    // CONSTRUCTOR
    // --------------------------------------------------------------------------------

    public Fraction(double citatel, double jmenovatel) {
        isValid(jmenovatel);
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
        simpFrac();
    }

    public Fraction(String zlomek) {
        String[] frac = zlomek.split("/");
        isValid(Double.parseDouble(frac[1]));
        this.citatel = Double.parseDouble(frac[0]);
        this.jmenovatel = Double.parseDouble(frac[1]);
        simpFrac();
    }

    // GETTERY
    // ----------------------------------------------------------------------------
    
    /**
     * Getter pro hodnotu citatel<p>
     * @return citatel v datovém typu Double
     */
    public double getCit() {
        return citatel;
    }

    /**
     * Getter pro hodnotu jmenovatel<p>
     * @return jmenovatel v datovém typu Double
     */
    public double getJme() {
        return jmenovatel;
    }

    // FUNKCE
    // -------------------------------------------------------------------------------------

    private void isValid(double jmenovatel) {
        if (jmenovatel == 0) {
            throw new IllegalArgumentException("\nNeplatny zlomek, deleni nulou\n" + getCit() + "/" + getJme() + " <- NULA\n");
        }
    }

    /**
     * Metoda pro vracení zlomku
     * <p>
     * Pro výpis:
     * <blockquote>
     * <pre>
     * System.out.printf("%s", this.getValue());
     * </pre>
     * </blockquote>
     * 
     * @return zlomek v datovém typu String
     */
    public String toString() {
        return this.getCit() + " " + this.getJme();
    }

    /**
     * Metoda pro vracení hodnoty zlomku
     * <p>
     * Pro vypis bez zaokrouhlení:
     * <blockquote>
     * <pre>
     * System.out.printf("%f", this.getValue());
     * </pre>
     * </blockquote>
     * Pro vypis se zaokrouhlením:
     * <blockquote>
     * <pre>
     * System.out.printf("%.2f", this.getValue());
     * </pre>
     * </blockquote>
     * @return hodnota zlomku v datovém typu Double
     */
    public double getValue() {
        double res;
        res = this.getCit() / this.getJme();
        return res; 
    }

    /**
     * Metoda pro vrácení zlomku<p>
     * Pro výpis:
     * <blockquote>
     * <pre>
     * System.out.printf("%s", this.prntFrac());
     * </pre>
     * </blockquote>
     * 
     * @return zlomek v datovém typu String<p>
     * citatel / jmenovatel
     */
    public String prntFrac() {
        return this.citatel + "/" + this.jmenovatel;
    }

    /**
     * Metoda pro vrácení zlomku<p>
     * Pro výpis:
     * <blockquote>
     * <pre>
     * System.out.printf("%s", this.prntFracNice());
     * </pre>
     * </blockquote>
     * 
     * @return zlomek v datovém typu String<p>
     * citatel<p>
     * __________<p>
     * jmenovatel
     */
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
        return this.getCit() + "\n" + divLine + "\n" + this.getJme();
    }

    /**
     * 
     * Metoda pro zjištění NSD<p>
     * NSD - Největší společný dělitel<p>
     * Pro výpis:
     * <blockquote>
     * <pre>
     * System.out.printf("%s", this.nsd());
     * </pre>
     * </blockquote>
     * 
     * @return NSD v datovém typu String<p>
     */
    public String nsd() {
        double a = this.citatel;
        double b = this.jmenovatel;
        if (a < 1 || b < 1)
            throw new IllegalArgumentException("Citatel nebo jmenovatel je mensi nez 1");
        while (b != 0) {
            double tmp = a;
            a = b;
            b = tmp % b;
        }
        if (a == 1) {
            return "Zlomek nema NSD";
        }
        return "NSD = " + a;
    }

    /**
     * Metoda pro zjištění NSD a vracení<p>
     * NSD - Nejmenší společný dělitel<p>
     * Pro výpis:
     * <blockquote>
     * <pre>
     * System.out.printf("%f", this.nsdValue());
     * </pre>
     * </blockquote>
     * <p>
     * Pokud zlomek nemá NSD, metoda vrací 0.
     * 
     * @return NSD v datovém typu Double<p>
     */

    public static double nsdValue(double a, double b) {
        double tmp;
        while (b != 0) {
            tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    private void simpFrac() {
        double nsd = nsdValue(citatel, jmenovatel);
        citatel = citatel / nsd;
        jmenovatel = jmenovatel / nsd;
    }

    public Fraction simpNewFrac() {
        double nsd = nsdValue(citatel, jmenovatel);
        double cit = citatel / nsd;
        double jme = jmenovatel / nsd;
        Fraction fracTmp = new Fraction(cit, jme);
        return fracTmp;
    }

    public String getSimplifiedFrac() {
        simpFrac();
        return prntFrac();
    }

}
