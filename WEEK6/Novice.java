package WEEK6;

public class Novice extends Player {
    public Novice(){
        setATK(5);
        setHP(10);
        setMP(10);
    }
    public void addEquipment(Item i){
        i.use(this);
    }

    @Override
    public void attack(Player p) {
        // TODO Auto-generated method stub
        p.attacked(this.getATK()/2.5);
    }

    @Override
    public void attacked(double n) {
        // TODO Auto-generated method stub
        this.setHP(-n);
    }
}
