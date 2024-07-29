/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creational1;

/**
 *
 * @author soumya
 */interface CarFactory {
    Car createCar();
}

interface Car {
}

class Sedan implements Car {
    public Sedan() {
        System.out.println("Created a sedan");
    }
}

class SUV implements Car {
    public SUV() {
        System.out.println("Created an SUV");
    }
}

class Truck implements Car {
    public Truck() {
        System.out.println("Created a truck");
    }
}

class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}

class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUV();
    }
}

class TruckFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Truck();
    }
}

public class Main {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();

        CarFactory suvFactory = new SUVFactory();
        Car suv = suvFactory.createCar();

        CarFactory truckFactory = new TruckFactory();
        Car truck = truckFactory.createCar();
    }
}
