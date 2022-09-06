package WEEK5;

public class Main {
    public static void main(String[] args) {
        // (1)Dont have default Constructor
        // Account a1 = new Account();
        // a1.showAccount();

        // (1)nice!!
        // Account a1 = new Account(50000,"61070033");
        // a1.showAccount();
        // a1.deposit(500);
        // a1.showAccount();
        // a1.withdraw(40000);
        // a1.showAccount();

        //(2) OKOK
        // CheckingAccount a1 = new CheckingAccount(50000,"61070033",5000);
        // a1.showAccount();
        // a1.deposit(500);
        // System.out.println(a1);
        // a1.withdraw("40000.0");
        // System.out.println(a1.toString());

        //(2) nice!!
        // CheckingAccount a1 = new CheckingAccount();
        // a1.deposit(500);
        // System.out.println(a1);
        // a1.withdraw(40000.0);
        // System.out.println(a1.toString());

        Account a1 = new CheckingAccount();
        a1.setCredit(1000);
        System.out.println(a1);
    }
}
