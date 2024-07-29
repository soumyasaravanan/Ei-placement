/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creational2;

/**
 *
 * @author soumya
 */
public class Main {
    public static void main(String[] args) {
        BurgerBuilder builder = new BurgerBuilder();
        Burger burger = builder.setPatty("beef").setCheese("cheddar").setLettuce("iceberg").build();
        System.out.println(burger);
    }
}