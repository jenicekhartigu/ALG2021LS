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
    /**
     * Setter pro hodnotu citatel<p>
     * nastavení hodnoty citatel
     */
    public void setCit(double citatel) {
        this.citatel = citatel;
    }

    /**
     * Setter pro hodnotu jmenovatel<p>
     * nastavení hodnoty jmenovatel
     */
    public void setJme(double jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

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

    private void isValid() {
        if (this.getJme() == 0) {
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
        this.isValid();
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
        this.isValid();
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
        this.isValid();
        return this.getCit() + "/" + this.getJme();
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
        this.isValid();
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
     * NSD - Nejmenší společný dělitel<p>
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
        this.isValid();
        double a = this.getCit();
        double b = this.getJme();
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
    public double nsdValue() {
        this.isValid();
        double a = this.getCit();
        double b = this.getJme();
        if (a < 1 || b < 1)
            throw new IllegalArgumentException("Citatel nebo jmenovatel je mensi nez 1");
        while (b != 0) {
            double tmp = a;
            a = b;
            b = tmp % b;
        }
        if (a == 1) {
            return 0;
        }
        return a;
    }
}
