package pro.sky.java.course2;

import pro.sky.java.course2.transport.Bus;
import pro.sky.java.course2.transport.Car;
import pro.sky.java.course2.transport.Transport;


public class Main {
    public static void main(String[] args) {
        //Задание 1.
        Transport transport1 = new Transport("Камаз", "002", 1990, "Россия",
                "Красный", 160);
        System.out.println(transport1);
        Car car1 = new Car("Lada", "Granta", 1.8, "white", 20200, "rus",
                "", "седан", 01, 4, 180);
        System.out.println(car1);
        //Задание 2.
        Bus busNefaz = new Bus("Нефаз", "001", 2020, "Russia",
                "Белый", 160, 4);
        System.out.println(busNefaz);
        Bus busPaz = new Bus("ПАЗ", "001", 2010, "Russia",
                "Белый", 160, 3);
        System.out.println(busPaz);
        Bus busPaz2 = new Bus("ПАЗ", "001", 2011, "Russia",
                "Белый", 160, 3);
        System.out.println(busPaz2);
    }
}