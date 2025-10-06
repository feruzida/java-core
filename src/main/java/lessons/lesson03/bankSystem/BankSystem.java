package lessons.lesson03.bankSystem;

import java.util.ArrayList;

public class BankSystem {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void deleteAccount(int accountNumber) {
        accounts.removeIf(account -> accountNumber == account.getAccountNumber());
    }

    public void replenishAccount(int accountNumber, double amount) {
        if (amount < 0) {
            System.out.println("You cannot send negative sum!");
            return;
        }
        for (Account account : accounts) {
            if (accountNumber == account.getAccountNumber()) {
                account.setBalance(account.getBalance() + amount);
                System.out.println(account.getFio() + " balance has been replenished: " + amount);
                System.out.println("Current balance: " + account.getBalance() + "\n");
            }
        }
    }

    public void transferMoneyBetweenAccounts(int from, int to, double amount) {
        Account sender = null;
        Account receiver = null;
        for (Account account : accounts) {
            if (account.getAccountNumber() == from) sender = account;
            if (account.getAccountNumber() == to) receiver = account;
        }
        if (sender == null || receiver == null) {
            System.out.println("One of the accounts was not found!");
            return;
        }
        if (sender.getBalance() < amount) {
            System.out.println("Not enough money for transfer!");
            return;
        }
        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);
        System.out.println("Transfer successful! " + amount + " from " + from + " to " + to + "\n");
    }

    public void getAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
        }
    }
}
