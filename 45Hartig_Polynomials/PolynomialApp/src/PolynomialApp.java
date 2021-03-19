public class PolynomialApp {
    public static void main(String[] args) throws Exception {

        Polynomial pp = Polynomial.getInstance(5,4,-1);
        System.out.println(pp);
        Polynomial tt = pp.derivate();
        System.out.println(tt);

    }
}
