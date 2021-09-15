import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte jmeno prvniho souboru");
        String jmenoSouboru1 = sc.nextLine();

        System.out.println("Zadejte jmeno druheho souboru");
        String jmenoSouboru2 = sc.nextLine();

        String prvniSoubor = NactiSoubor(jmenoSouboru1);

        //System.out.println(prvniSoubor);
        
        String druhySoubor = NactiSoubor(jmenoSouboru2);

        if (druhySoubor.toLowerCase().matches(prvniSoubor.toLowerCase())){
            System.out.println("Je stejny");
        } else {
            System.out.println("Neni stejny");
        }
        */
        /*Scanner sc = new Scanner(System.in);
        int pocetTymu = sc.nextInt();

        int[][] pole = new int[pocetTymu][pocetTymu];
        int x = 0;
        for(int i = 0; i < pole.length; i++){
            for (int j = 0; j < pole.length; j++) {
                if(i == j){
                   pole[i][j] = 0; 
                   x++;
                } else {
                    pole[i][j] = x;
                }
                x++;
            }
        }
        for(int i = 0; i < pole.length; i++){
            for (int j = 0; j < pole.length; j++) {
                if(pole[i][j] < 10){
                    System.out.print(" " + pole[i][j] + " ");
                } else {
                    System.out.print(pole[i][j] + " ");
                }
            }
            System.out.println();
        }
        */
        /*


        ArrayList<Uzivatel> Uzi = NactiData(); 
        ArrayList<Uzivatel> AJ = new ArrayList<>();
        ArrayList<Uzivatel> NJ = new ArrayList<>();
        

        System.out.println("Podle Cisla -----------------------------------------------");
        Collections.sort(Uzi, Uzivatel.SortById);

        for (Uzivatel s : Uzi)
            { System.out.println(s); }

        System.out.println("Podle Jmena -----------------------------------------------");
        Collections.sort(Uzi, Uzivatel.SortByJmeno);

        for (Uzivatel s : Uzi)
            { System.out.println(s); }
        
        System.out.println("Podle Predmetu --------------------------------------------");
        Collections.sort(Uzi, Uzivatel.SortByPredmet);
        int c = 0;
        for (Uzivatel s : Uzi){
            if (s.getPredmet().matches("AJ")){
                c++;
                AJ.add(s);
            } else {
            NJ.add(s);
            //System.out.println((s.getPredmet().matches("AJ")));
            //System.out.println(s);}
            }
        }
        Collections.sort(AJ, Uzivatel.SortById);
        for (Uzivatel s : AJ)
            { System.out.println(s); }
        System.out.println("---");
        Collections.sort(NJ, Uzivatel.SortById);
        for (Uzivatel s : NJ)
            { System.out.println(s); }

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for (Uzivatel s : NJ)
                { myWriter.write(s.getId() + " " + s.getJmeno() + " " + s.getPredmet() + "\n"); }
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
        */
        
        
        int x = 0;
        int[] pole = new int[10]; 
        for (int i = 0; i < pole.length; i++) {
            pole[i] = x;
            x++;
        }
        for (int j = 0; j < pole.length; j++) {
            System.out.print(pole[j] + " ");
        }
        int term;
        System.out.println();
        term = getRandom(pole);
        pole = removeTheElement(pole, term);
        System.out.println(term);
        
        for (int j = 0; j < pole.length; j++) {
            System.out.print(pole[j] + " ");
        }
        
        
    }
        
        
        

    public static int[] removeTheElement(int[] arr, int index)
    {
        if (arr == null
            || index < 0
            || index >= arr.length) {
  
            return arr;
        }
  
        // Create ArrayList from the array
        List<Integer> arrayList = IntStream.of(arr)
                                      .boxed()
                                      .collect(Collectors.toList());
  
        // Remove the specified element
        arrayList.remove(index);
  
        // return the resultant array
        return arrayList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static String NactiSoubor(String jmenoSouboru) {
        BufferedReader reader;
        String celySoubor = "";

        try {
            reader = new BufferedReader(new FileReader("./"+jmenoSouboru));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                celySoubor += line;
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Soubor nebyl nalezen");
			e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        }
        return celySoubor;
    }


    public static ArrayList<Uzivatel> NactiData() {
        BufferedReader reader;

        ArrayList<Uzivatel> Uzivatele = new ArrayList<>();
        Uzivatel uzi;

		try {
			reader = new BufferedReader(new FileReader("./jmenacisla.txt"));
			String line = reader.readLine();
			while (line != null) {
				//System.out.println(line + " " + x);
				String[] arrOfStr = line.split(",",-2);
                
                uzi = new Uzivatel(arrOfStr[0], Integer.parseInt(arrOfStr[1]), arrOfStr[2]);
                Uzivatele.add(uzi);
				line = reader.readLine();
			}
			reader.close();

		} catch (FileNotFoundException e) {
            System.out.println("Soubor nebyl nalezen");
			e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        }
        return Uzivatele;
    }
}
