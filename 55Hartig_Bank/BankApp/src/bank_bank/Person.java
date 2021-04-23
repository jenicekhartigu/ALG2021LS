package bank_bank;

public class Person extends Client {

    public Person(String name) {
        super(name);
    }

    @Override
    public String addressClient() {
        String name = super.name;
        //String ending = name.substring(name.length() - 3);
        //boolean ending2 = name.matches(".*ova");
        boolean isFemale = name.endsWith("ova");
        String greeting = (isFemale)?"Pani":"Pan";
        return String.format("%s %s", greeting, name);
    }
    

    public static void main(String[] args) {
        /*String s = "Svecova";
        System.out.println(s.substring(s.length() - 3));
        System.out.println();
        */

        Person p = new Person("Svecova");
        System.out.println(p.addressClient());
    }
}
