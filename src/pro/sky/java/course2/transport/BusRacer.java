package pro.sky.java.course2.transport;

public class BusRacer implements Racer{
    @Override
    public void printPitStop() {
        System.out.println("Автобус заехал на  пит-стоп.");
    }

    @Override
    public void printTheBestCircleTime() {
        System.out.println("Лучшее время круга для автобуса: ");
    }

    @Override
    public void printMaxSpeed() {
        System.out.println("Максимальная скорость автобуса: ");
    }
}
