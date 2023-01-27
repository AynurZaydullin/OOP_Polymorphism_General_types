package pro.sky.java.course2.transport;

import java.time.LocalDate;

public class Car extends Transport {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Легковой автомобиль начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Легковой автомобиль остановил движение.");
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " + super.toString()
                ;
    }
}
