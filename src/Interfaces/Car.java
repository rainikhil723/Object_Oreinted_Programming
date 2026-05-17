package Interfaces;

public class Car implements Brake , Engine , Media{
    @Override
    public void brake() {
        System.out.println(" My task is to apply brake in a car");
    }

    @Override
    public void start() {
        System.out.println(" My task is to start a car");
    }

    @Override
    public void stop() {
        System.out.println(" My task is to stop a car");
    }

    @Override
    public void acc() {
        System.out.println(" My task is to apply accelaration in a car");
    }
}
