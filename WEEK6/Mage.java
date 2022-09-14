package WEEK6;

public class Mage extends Player {
    public Mage(){
        setATK(5);
        setHP(10);
        setMP(20);
    }
    public void addEquipment(Item i){
        i.use(this);
    }

    @Override
    public void attack(Player p) {
        // TODO Auto-generated method stub
        p.attacked(this.getATK());
        this.setMP(-5);
    }

    @Override
    public void attacked(double n) {
        // TODO Auto-generated method stub
        this.setHP(-n);
    }
}
