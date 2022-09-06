package WEEK5;

public class Customer extends CheckingAccount{
    private String firstName;
    private String lastname;
    private CheckingAccount acct;

    public Customer() {
        this("", "", null);
    }
    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastname = lastName;
        this.acct = acct;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }
    public CheckingAccount getAcct() {
        return acct;
    }

    @Override
    public String toString() {
        if (acct == null) {return firstName + " " + lastname + " doesn't have account.";}
        else {return "The " + firstName + " account has " + acct.balance + " baht and " + acct.getCredit() + " credits.";}
        
    }


    public boolean equals(Customer c) {
        if (this.lastname.equals(c.lastname)){
            return true;
        }
        else {
            return false;
        }
    }
}
