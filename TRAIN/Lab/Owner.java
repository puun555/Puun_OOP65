public class Owner {
    protected final String name;
    protected Animal animal;
    
    public Owner() {
        this.name = "";
        this.animal = null;
    }
    
    public Owner(String name) {
        this.name = name;
        this.animal = null;
    }
    public Owner(Animal animal) {
        this.name = "";
        this.animal = animal;
    }
    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }
    
    public String getName() {
        return this.name;
    }
    
    
    public void setAnimal() {
        
    }
    public Animal getAnimal(){
        return this.animal;
    }
    
    public void feedFood(Food f) {
        this.animal.setPower(f.getPower());
    }
    @Override
    public String toString() {
        return "Owner : name = " + this.name + ", Animal : name = " + animal.getName() + ", power = " + animal.getPower() + ", age = "+ animal.getAge();
    }
    
    public void protectOwnerFrom(Animal a) {
        if (this.animal instanceof Dog) {
            ((Dog)this.animal).kick(a);
        }
        else {
            ((Pigeous)this.animal).wingAttack(a);
        }
    }
}
