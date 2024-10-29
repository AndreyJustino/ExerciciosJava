package util;

public class Account {
    private final int numberAccount;
    private String name;
    private double balance;

    public Account(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
        balance = 0.0;
    }

    public Account(int numberAccount, String name, double balanceInitial){
        this.numberAccount = numberAccount;
        this.name = name;
        deposit(balanceInitial);
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return balance;
    }

    public String toString(){
        return "Numero da conta: " +
                getNumberAccount() +
                ", Nome do titular: " +
                getName() +
                ", Saldo: R$ " +
                getValue();
    }


    public void deposit(double value){
        this.balance += value;
    }

    public void withdraw(double value){
        this.balance = this.balance - value - 5;
    }

}
