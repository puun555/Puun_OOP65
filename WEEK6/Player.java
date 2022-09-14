package WEEK6;

public abstract class Player {
    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP += HP;
    }

    public double getMP() {
        return MP;
    }
    public void setMP(double MP) {
        this.MP += MP;
    }

    public void setEXP(double EXP) {
        this.EXP = EXP;
    }
    public double getEXP() {
        return EXP;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }
    public double getMoney() {
        return Money;
    }

    public void setATK(double ATK) {
        this.ATK += ATK;
    }
    public double getATK() {
        return ATK;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "HP : "+HP+" MP : "+MP+" ATK : "+ATK;
    }

    public abstract void attack(Player p);

    public abstract void attacked(double n);
}
