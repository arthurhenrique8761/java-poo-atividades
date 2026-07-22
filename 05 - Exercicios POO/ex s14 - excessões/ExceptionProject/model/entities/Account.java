package model.entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if (amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        }
        else if (amount > balance) {
            throw new DomainException("Not enough balance");
        }

        balance -= amount;
    }

    public Double getBalance() {
        return balance;
    }
}
