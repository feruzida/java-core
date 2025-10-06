package lessons.lesson03.bankSystem;

public class MainBankSystem {
    public static void main(String[] args) {
        Account accountNew = new Account(1234, "Aleksey Kivovarov", 9022212.5);
        Account accountNew1 = new Account(1235, "Aleksey Kavalniy", 123);
        BankSystem bankSystem = new BankSystem();
        bankSystem.addAccount(accountNew);
        bankSystem.getAccounts();
        System.out.println();

        bankSystem.transferMoneyBetweenAccounts(1234, 1235, 877);
        System.out.println();

        bankSystem.replenishAccount(1234, -456);
        System.out.println();

        bankSystem.replenishAccount(1234, 0.5);
        System.out.println();

        bankSystem.addAccount(accountNew1);
        bankSystem.transferMoneyBetweenAccounts(1234, 1235, 9022212);
        bankSystem.getAccounts();
        System.out.println();

        bankSystem.deleteAccount(1235);
        bankSystem.deleteAccount(1234);
        bankSystem.getAccounts();
    }
}
