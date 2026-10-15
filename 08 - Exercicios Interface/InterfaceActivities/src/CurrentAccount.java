public class CurrentAccount implements Account {

    private String holder;
    private Double balance;

    public CurrentAccount(String holder, Double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public void deposit(Double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(Double amount) {
        if (this.balance < 0) {
            System.out.println("Withdraw not allowed: Insufficient balance");
        }
        else {
            this.balance -= amount;
        }
    }

    @Override
    public Double viewBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return String.format("Holder: %s, Balance: %.2f", holder, balance);
    }
}
