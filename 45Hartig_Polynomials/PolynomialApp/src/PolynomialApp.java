public class PolynomialApp {
    public static void main(String[] args) throws Exception {

        Polynomial pp = Polynomial.getInstance(1,3,2,0,9,4);
        System.out.println(pp);
        System.out.println(pp.getStupen());
        System.out.println(pp.getCoefAtIndex(8));
        System.out.printf("%f \n", pp.hornerValue(2));
        System.out.println(pp.polyString());

    }
}
