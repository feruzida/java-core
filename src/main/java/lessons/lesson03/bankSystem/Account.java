package lessons.lesson03.bankSystem;

public class Account {
    private int accountNumber;
    private String fio;
    private double balance;

    public String getFio() {
        return fio;
    }

    public Account(int accountNumber, String fio, double balance) {
        this.accountNumber = accountNumber;
        this.fio = fio;
        this.balance = balance;
    }

    public String getAccountInfo() {
        return "AccountNumber: " + accountNumber + "\nFIO: " + fio + "\nBalance: " + balance + "\n";
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

