package pro.sky.java.course2.transport;

public class Bus extends Transport{
    private int doorsNumber;//Дополнительное свойство - количество дверей в автобусе

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, int doorsNumber) {
        super(brand, model, year, country, color, maxSpeed);
        setDoorsNumber(doorsNumber);
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    private void setDoorsNumber(int doorsNumber) {
        if (doorsNumber <= 0 || doorsNumber > 5) {
            throw new IllegalStateException("Недопустимое значение: " + doorsNumber);
        } else {
            this.doorsNumber = doorsNumber;
        }
    }

    @Override
    public String toString() {
        return "Атобус: " + super.toString() + ", " +
                "doorsNumber - " + doorsNumber;
    }
}
