/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational2;

/**
 *
 * @author soumya
 */public class Burger {
    private String patty;
    private String cheese;
    private String lettuce;

    public Burger(String patty, String cheese, String lettuce) {
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
    }

    @Override
    public String toString() {
        return "Burger with " + patty + ", " + cheese + ", and " + lettuce;
    }
}