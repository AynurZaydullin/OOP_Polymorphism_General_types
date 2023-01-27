package pro.sky.java.course2.transport;

public class CarRacer implements Racer{

    @Override
    public void printPitStop() {
        System.out.println("Car pit-stop.");
    }

    @Override
    public void printTheBestCircleTime() {
        System.out.println("Car the best circle time.");
    }

    @Override
    public void printMaxSpeed() {
        System.out.println("Car max speed.");
    }
}
