package pro.sky.java.course2.transport;

public class Truck extends Transport{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Грузовик начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановил движение.");
    }

    @Override
    public String toString() {
        return "Грузовик: " + super.toString();
    }
}
