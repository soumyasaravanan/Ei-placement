/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

/**
 *
 * @author soumya
 */// Adapter Pattern: Image Adapter


class ImageAdapter extends Image {
    private LegacyImage legacyImage;

    public ImageAdapter(LegacyImage legacyImage) {
        this.legacyImage = legacyImage;
    }

    @Override
    public void resize(int width, int height) {
        double scaleFactor = (width + height) / 2.0; // Simple conversion example
        legacyImage.resizeLegacy(scaleFactor);
    }
}

public class Main {
    public static void main(String[] args) {
        LegacyImage legacyImage = new LegacyImage();
        Image image = new ImageAdapter(legacyImage);
        image.resize(800, 600);
    }
}

// Decorator Pattern: Beverage


class Milk extends Decorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}

class Mocha extends Decorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.7;
    }
}

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("Cost: " + beverage.cost());

        beverage = new Milk(beverage);
        System.out.println("Cost: " + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println("Cost: " + beverage.cost());
    }
}
