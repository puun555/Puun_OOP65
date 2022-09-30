public class Billionair extends Person {
    private String name;
    private double money;
    
    public Billionair() {
        this("Puun", 0);
    }

    public Billionair(String name, double money) {
        this.money = money;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public double getMoney() {
        return money;
    }

    public void benefit(double money) {
        this.money += 0.2*money;
    }

    public double disapear(double money) {
        if (this.money - money <= 0) {
            money = this.money;
            this.money = 0;
        }
        else {
            this.money -= money;
        }

        return money;
    }

    public void showMoney() {
        System.out.println("I'm a " + this.name + " Thief and I have " + this.money);
    }

}
