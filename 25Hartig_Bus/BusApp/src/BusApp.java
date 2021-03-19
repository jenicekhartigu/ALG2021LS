import java.util.Scanner; 

public class BusApp {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, World!");

        Bus mujBus = new Bus("Arriva", 69, 40);

        for(int i = 0; i < 5;i++) {
            if (i == 4) {
                System.out.printf("%d. zastavka - konecna\n",i+1);
                System.out.println(mujBus.toString());
                mujBus.vystoupeniALL();
            } else {
                System.out.printf("%d. zastavka\n",i+1);
                System.out.println(mujBus.toString());
                System.out.println("Zadejte kolik lidi ma vystoupit a kolik nastoupit:");
                mujBus.nastoupeniPoc(sc.nextInt());
                mujBus.vystoupeniPoc(sc.nextInt());
                System.out.println(mujBus.toString());
            }
        }
    }
}
