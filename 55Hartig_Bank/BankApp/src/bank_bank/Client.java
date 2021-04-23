package bank_bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Client implements Comparable<Client> {
    private List<Account> accounts;
    protected String name;

    public Client(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void addAccount(Account a){
        this.accounts.add(a);
    }

    public void addAccount(long money){
        this.accounts.add(new Account(money));
    }

    public long getAllMoney(){
        long result = 0;
        for (Account account : accounts) {
            result += account.getMoney();
        }
        return result;
    }

    public abstract String addressClient();
    
    @Override
    public int compareTo(Client c) {

        /*if(this.getAllMoney() > c.getAllMoney()) {
            return 1;
        } else if(this.getAllMoney() > c.getAllMoney()) {
            return -1;
        } return 0;*/
        return (int)(this.getAllMoney() - c.getAllMoney());
    }
}
