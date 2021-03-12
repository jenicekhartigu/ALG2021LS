public class BusApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Bus mujBus = new Bus("Arriva", 69, 40, 20);
        mujBus.setNazSpol("BusLine");
        mujBus.setCisLinky(98);

        System.out.println(mujBus.toString());

        Bus mujBus2 = new Bus("Arriva", 69, 20, 40);

        
    }
}
