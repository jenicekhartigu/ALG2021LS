public class FractionApp {
    public static void main(String[] args) throws Exception {
        Fraction zlom1 = new Fraction(300, 216);
        Fraction zlom2 = new Fraction(6, 0);
        
        System.out.printf("%.2f\n",zlom1.getCit());
        System.out.printf("%.2f\n",zlom1.getJme());
        System.out.printf("%s\n",zlom1.toString());
        System.out.printf("%s\n",zlom1.prntFrac());
        System.out.printf("%s\n",zlom1.prntFracNice());
        System.out.printf("%.2f\n",zlom1.getValue());
        System.out.printf("%s\n",zlom1.nsd());
        System.out.printf("%s\n",zlom1.nsdValue());
        System.out.printf("%f",zlom2.getValue());
    }
}
