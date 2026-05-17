package Interfaces;

public class Main {
    static void main(String[] args) {
        Car car = new Car();

        car.acc();
        car.brake();
        car.start();
        car.stop();

//        My task is to apply accelaration in a car
//        My task is to apply brake in a car
//        My task is to start a car
//        My task is to stop a car

        Media car2 = new Car();
        car.stop();
        car.stop();
        //else other can be accessed as already discussed that Media decides what to pick and show
    }
}
