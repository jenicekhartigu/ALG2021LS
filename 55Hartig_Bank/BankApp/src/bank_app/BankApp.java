package bank_app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import bank_bank.Client;
import bank_bank.Company;
import bank_bank.Person;

public class BankApp {
    public static void main(String[] args) {
        Person pekar = new Person("Pekar");
        Person svecova = new Person("Svecova");
        Company skoda = new Company("Skoda");
        
        pekar.addAccount(1000);
        pekar.addAccount(500);
        svecova.addAccount(1200);
        skoda.addAccount(120);

        List<Client> clients = new ArrayList<>(Arrays.asList(pekar, svecova, skoda));
        
        for (Client client : clients) {
            System.out.println(client.addressClient() + " " + client.getAllMoney());
        }

        System.out.println("");
        Collections.sort(clients);

        for (Client client : clients) {
            System.out.println(client.addressClient() + " " + client.getAllMoney());
        }
    }
}
