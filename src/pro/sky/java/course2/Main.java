package pro.sky.java.course2;

import pro.sky.java.course2.transport.*;


public class Main {
    static Transport<TruckDriver> truck;
    public static void main(String[] args) {
        //Задание 1.
        for (int i = 0; i < 4; i++) {
            CarDriver carDriver = new CarDriver("Z" + i, "A", "A", "B", 1);
            BusDriver busDriver = new BusDriver("W" + i, "A", "A", "D", 1);
            Transport<CarDriver> car = new Car<>("Car" + i, "b", 2.0, carDriver);
            truck = new Truck<>("Car" + i, "b", 2.0, carDriver);
            Transport<BusDriver> bus = new Bus<>("Car" + i, "b", 2.0, carDriver);
            printInfo(car);
//            car.setDriver(truckDriver);
            printInfo(car);
        }
        truck.setDriver(new TruckDriver("S" + 1, "A", "A", "C", 1));
        printInfo(truck);
//        TruckDriver truckDriver = new TruckDriver("S", "A", "A", "C", 1);
//        car1.printMaxSpeed();
//        Racer carRacer = new Car<>("b", "b", 2.0, carDriver);
//        carRacer.printMaxSpeed();

    }

    private static void printInfo(Transport<?>  transport) {
        System.out.println("Водитель: " + transport.getDriver() + ", " + "Марка машины - " + transport.getBrand());
    }
}