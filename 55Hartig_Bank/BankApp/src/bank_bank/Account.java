package bank_bank;

public class Account {
    //data
    private long money;

    public Account(){
        this.money = 0;
    }

    public Account(long money){
        this.money = money;
    }

    public void addMoney(long money){
        this.money += money; 
    }

    public boolean giveMoney(long money){
        if(money > this.money){
            return false;
        }
        this.money -= money;
        return true;
    }

    public long getMoney() {
        return money;
    }

    public static void main(String[] args) {
        Account a = new Account();
        //a.addMoney(200);
        a.giveMoney(100);
        System.out.println(a.getMoney());
    }

    
}
