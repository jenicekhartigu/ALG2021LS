public class FractionApp {
    public static void main(String[] args) throws Exception {
        Fraction zlom1 = new Fraction(100, 25);
        Fraction zlom2 = new Fraction(4555, 0);

        System.out.println("citatel zl1: " + zlom1.getCit());
        System.out.println("jmenovatel zl1: " + zlom1.getJme());
        System.out.println();

        System.out.println("to string zl1: " + zlom1.toString());
        System.out.println("to string zl2: " + zlom2.toString());

        System.out.println("Dva druhy vypisu zl1");
        System.out.println(zlom1.prntFrac());
        System.out.println(zlom1.prntFracNice());

        System.out.println("Dva druhy vypisu zl2");
        System.out.println(zlom2.prntFrac());
        System.out.println(zlom2.prntFracNice());

        System.out.println("value zl1: " + zlom1.getValue());
        System.out.println("value zl2: " +zlom2.getValue());
    }
}
