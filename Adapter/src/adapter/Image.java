/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author soumya
 */public abstract class Image {
    public abstract void resize(int width, int height);
}

class LegacyImage {
    public void resizeLegacy(double scaleFactor) {
        // Legacy resizing logic
        System.out.println("Resizing legacy image with scale factor: " + scaleFactor);
    }
}
