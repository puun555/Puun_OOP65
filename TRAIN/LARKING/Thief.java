
public class Thief extends Person{
    private String name;
    private double money;

    public Thief() {
        this("Gear", 0);
    }

    public Thief(String name, double money) {
        this.money = money;
        this.name = name;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void steal(double money, Person m) {
        Billionair n = ((Billionair)m);
        this.money += n.disapear(money);
    }

    @Override
    public void showMoney() {
        System.out.println("I'm a " + this.name + " Thief and I have " + this.money);
    }
}

