public class BankAccount {
    private final String accountNumber;
    private final String currency;
    private double balance;

    public BankAccount(String accountNumber, String currency, double initialBalance) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Not enough money.");
        }
        balance -= amount;
    }
}