package pro.sky.java.course2;

import pro.sky.java.course2.transport.*;


public class Main {
    public static void main(String[] args) {
        //Задание 1.
        Transport car1 = new Car("Lada", "Granta", 1.8);
        System.out.println(car1);
        Transport track1 = new Truck("KAMAZ", "001", 9.0);
        System.out.println(track1);
        Transport bus1 = new Bus("PAZ", "001", 5.0);
        System.out.println(bus1);
        CarRacer racer1 = new CarRacer();
        racer1.printMaxSpeed();
        racer1.printPitStop();
        racer1.printTheBestCircleTime();
        Driver driver1 = new Driver("Petrov", "Ivan", "Iv","B","fff");

    }
}