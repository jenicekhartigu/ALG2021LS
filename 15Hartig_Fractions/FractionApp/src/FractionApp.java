public class FractionApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello dasdasda!");
        Fraction prvniZlomek = new Fraction(10, 20);
        Fraction druhyZlomek = new Fraction(456, 13);

        System.out.println(prvniZlomek.getCitatel());
        System.out.println(prvniZlomek.getJmenovatel());
        System.out.println();
        System.out.println(prvniZlomek.vypisZlomek());
        System.out.println(prvniZlomek.getVysledek());
        System.out.println();
        System.out.println(druhyZlomek.vypisZlomekHezky());
        System.out.println(druhyZlomek.getVysledek());
    }
}
