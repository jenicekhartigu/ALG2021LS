import java.util.Comparator;

public class Uzivatel {
    public String jmeno;
    public int id;
    public String predmet;

    public Uzivatel(String jmeno, int id, String predmet) {
        this.jmeno = jmeno;
        this.id = id;
        this.predmet = predmet;
    }

    public String getJmeno() {
        return jmeno;
    }
    public int getId() {
        return id;
    }
    public String getPredmet() {
        return predmet;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public void setid(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Uzivatel [id=" + id + ", jmeno=" + jmeno + ", predmet=" + predmet + "]";
    }

    public static Comparator<Uzivatel> SortById = new Comparator<Uzivatel>() {

        public int compare(Uzivatel uzi1, Uzivatel uzi2) {
    
           int UziId1 = uzi1.getId();
           int UziId2 = uzi2.getId();
    
           /*For ascending order*/
           return UziId1-UziId2;
    
           /*For descending order*/
           //return UziId2-UziId1;
       }
    };

    public static Comparator<Uzivatel> SortByJmeno = new Comparator<Uzivatel>() {

        public int compare(Uzivatel uzi1, Uzivatel uzi2) {
           String UziJmeno1 = uzi1.getJmeno().toUpperCase();
           String UziJmeno2 = uzi2.getJmeno().toUpperCase();
    
           //ascending order
           return UziJmeno1.compareTo(UziJmeno2);
    
           //descending order
           //return UziJmeno2.compareTo(UziJmeno1);
        }
    };
    
    public static Comparator<Uzivatel> SortByPredmet = new Comparator<Uzivatel>() {

        public int compare(Uzivatel uzi1, Uzivatel uzi2) {
           String UziPredmet1 = uzi1.getPredmet().toUpperCase();
           String UziPredmet2 = uzi2.getPredmet().toUpperCase();
    
           //ascending order
           return UziPredmet1.compareTo(UziPredmet2);
    
           //descending order
           //return UziPredmet2.compareTo(UziPredmet1);
        }
    };
    

    
}