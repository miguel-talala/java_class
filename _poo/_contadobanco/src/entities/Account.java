package entities;

public class Account {
    private static final double TAX = 5.00;
    private int accountNumber;
    private String titularName;
    private double balance;
    //Constructors
    public Account(){

    }
    public Account(int accountNumber, String titularName){
        this.accountNumber = accountNumber;
        this.titularName = titularName;

    }
    public Account(int accountNumber, String titularName, double initialDeposit){
        this.accountNumber = accountNumber;
        this.titularName = titularName;
        this.balance = initialDeposit;
    }
    //Getters
    public String getTitularName() {
        return titularName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    //Setters
    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }

    public void depositValue(double value){
        if(value > 0) {
            this.balance += value;
        }
    }
    public void withdrawValue(double value){
        if(value > 0) {
            this.balance -= (value + TAX);
        }
    }
    @Override
    public String toString() {
        return "Account: "
                + accountNumber
                + ", Holder: "
                + titularName
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
