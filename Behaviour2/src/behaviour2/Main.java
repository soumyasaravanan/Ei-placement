/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package behaviour2;

/**
 *
 * @author soumya
 */


public class Main {

    public static void main(String[] args) {
        Game game = new ChessGame();
        game.play();

        game = new CheckersGame();
        game.play();
    }
}