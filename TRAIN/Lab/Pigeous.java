/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Pigeous extends Bird {
    public Pigeous() {
        super("", 0);
    }
    
    public Pigeous(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void wingAttack(Animal a) {
        a.setPower(-5);
    }
    public void wingAttack(Animal a, int times) {
        a.setPower(-5*times);
    }
    @Override
    public void eat(Food f) {
        setPower(2*(f.getPower()));
    }
    @Override
    public void fly() {
        System.out.println( getName() + " fly fly ....");
    }
    
    
}
