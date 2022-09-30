/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, 200, age);
    }
    
    public void eat(Food f){
        setPower(f.getPower());
    }
    public void kick(Animal a) {
        a.setPower(-10);
    }
}
