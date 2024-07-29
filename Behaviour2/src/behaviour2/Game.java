/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behaviour2;

/**
 *
 * @author soumya
 */public abstract class Game {

    public final void play() {
        initialize();
        start();
        end();
    }

    protected abstract void initialize();

    protected abstract void start();

    protected abstract void end();
}
