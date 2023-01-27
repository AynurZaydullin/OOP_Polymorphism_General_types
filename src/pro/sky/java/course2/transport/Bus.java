package pro.sky.java.course2.transport;

public class Bus extends Transport{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Автобус остановил движение.");
    }

    @Override
    public String toString() {
        return "Атобус: " + super.toString();
    }
}
