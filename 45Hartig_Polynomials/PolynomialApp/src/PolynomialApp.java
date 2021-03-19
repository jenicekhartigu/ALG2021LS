public class PolynomialApp {
    public static void main(String[] args) throws Exception {

        Polynomial pp = Polynomial.getInstance(89, 6,0, 5,0);
        System.out.println(pp);
        Polynomial tt = pp.derivate();
        System.out.println(tt);

    }
}
