public class PolynomialApp {
    public static void main(String[] args) throws Exception {
        //double[] p = {-1,4,5};
        //Polynomial pp = new Polynomial.getInstance(p);
        //System.out.println(pp);
        //p[0] = 1 ;
        //System.out.println(pp);
        Polynomial pp = Polynomial.getInstance(5,4,-1);
        Polynomial pp1 = Polynomial.getInstanceRev(-1,4,5);
        System.out.println(pp);
        System.out.println(pp1);
    }
}
