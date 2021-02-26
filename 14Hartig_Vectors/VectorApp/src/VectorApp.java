public class VectorApp {
    public static void main(String[] args) throws Exception {
        Vector vec = new Vector(2,2);
        Vector vec2 = new Vector(2,4);
        System.out.println(vec.toString());
        System.out.println(vec2.toString());
        System.out.println(vec.sumVec(vec2));
        vec.expandVec(2);
        System.out.println(vec.toString());
    }
}
