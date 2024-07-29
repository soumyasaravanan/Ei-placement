/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author soumya
 */
public abstract class Beverage {
    public abstract double cost();
}

class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }
}
