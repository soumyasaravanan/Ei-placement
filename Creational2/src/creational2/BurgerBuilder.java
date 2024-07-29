/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational2;

/**
 *
 * @author soumya
 */
public class BurgerBuilder {
    private String patty;
    private String cheese;
    private String lettuce;

    public BurgerBuilder setPatty(String patty) {
        this.patty = patty;
        return this;
    }

    public BurgerBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public BurgerBuilder setLettuce(String lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public Burger build() {
        return new Burger(patty, cheese, lettuce);
    }
}


