
public class Account {
    private int number;
    private String name;
    private double balance;

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Account(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) throws AccountException {
        if (amount <= 0) {
            throw new AccountException("Invalid deposit amount!");
        }
        balance += amount;
    }

    @Override
    public String toString() {
        return number + " " + name + " " + balance;
    }
}