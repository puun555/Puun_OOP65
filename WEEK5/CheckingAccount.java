package WEEK5;

public class CheckingAccount extends Account {
    private double credit;

    public CheckingAccount() {
        super(0, "");
        this.credit = 0;
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    
    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit() {
        return credit;
    }

    public void withdraw(double a) {
        if (balance - a >= 0) {
            balance -= a;
        }
        else if (balance + this.credit - a >= 0) {
            this.credit -= a - balance;
            balance = 0;
            System.out.println( a + " baht is withdrawn from "+ name + " and your credit balance is " + this.credit + ".");
        }

        else {
            System.out.println("Not enough money!");
        }
    }

    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }
    
    public String toString() {
        return "The " + name + " account has " + balance + " bath and " + credit + " credits.";
    }
}