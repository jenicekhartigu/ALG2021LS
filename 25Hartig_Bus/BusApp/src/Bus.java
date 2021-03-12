public class Bus {
    private String nazSpol;
    private int cisLinky;
    private int pocSed;
    private int pocCes;

    public Bus() {
        nazSpol = "Bez společnosti";
        cisLinky = 0;
        pocSed = 40;
        pocCes = 0;
    }

    public Bus(String nazSpol, int cisLinky, int pocSed, int pocCes) {
        this.nazSpol = nazSpol;
        this.cisLinky = cisLinky;
        jeDostSedadel(pocSed, pocCes);
        this.pocSed = pocSed;
        this.pocCes = pocCes;
    }
    
    private void jeDostSedadel(int pocSed, int pocCes) {
        if (pocCes > pocSed){
            throw new IllegalArgumentException("\n Pocet cestujicich je vetsi nez pocet sedadel\n");
        }
    }

    


    public String toString() {
        return "Autobus cislo "+ cisLinky +" spolecnosti "+ nazSpol +" s poctem sedadel "+ pocSed +" veze "+ pocCes +" cestujicich \n";
    }

    public void setNazSpol(String nazSpol) {
        this.nazSpol = nazSpol;
    }

    public void setCisLinky(int cisLinky) {
        this.cisLinky = cisLinky;
    }

    /*
    public void vypisBus() {
        System.out.printf("Autobus cislo %d spolecnosti %s s poctem sedadel %d veze %d cestujicich \n", cisLinky, nazSpol, pocSed, pocCes);
    }
    */

    public void nastoupeniPoc(int pocet) {
        int cestCelkem = pocCes + pocet;
        int volneSed = pocSed - pocCes;
        if(cestCelkem>pocSed) {
            System.out.println("Nastopilo jen " + volneSed + " lidi");
            pocCes = pocSed;
        } else {
            pocCes = pocCes + pocet;
            System.out.printf("Do autobusu nastoupilo %d cestujich\n", pocet);
        }
    }

    public void vystoupeniPoc(int pocet) {
        if(pocet>pocCes){
            System.out.println("Tolik lidi v autobuse ani neni.");
            vystoupeniALL();            
        } else {
            pocCes = pocCes - pocet;
            System.out.printf("Z autobusu vystoupilo %d cestujich\n", pocet);
        }

    }

    public void vystoupeniALL() {
        System.out.printf("Z autobusu vystoupilo %d cestujich\n", pocCes);
        pocCes = 0;

    }
    
}
