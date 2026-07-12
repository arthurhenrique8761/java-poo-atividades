package entities;

public class Account {

    private int accountNum;
    private String name;
    private double balance;

    /* constructor */
    public Account(int accountNum, String name) {
        this.accountNum = accountNum;
        this.name = name;
        balance = 0;
    }

    /* account info caller */
    public String accountData() {
        return "Account " + getAccountNum() + ", Holder: " + getName() + ", Balance: " + String.format("$%.2f", getbalance()) + "\n";
    }

    /* setters */
    public void setBalanceDeposit(double deposit) {
        balance += deposit;
    }

    public void setBalanceWithdraw(double withdraw) {
        balance -= (withdraw + 5.00);
    }

    /* getters */
    public String getName() {
        return this.name;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public double getbalance() {
        return balance;
    }
}