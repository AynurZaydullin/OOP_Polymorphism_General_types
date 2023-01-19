package pro.sky.java.course1.OOP_Introduction;

public class Main {
    public static void main(String[] args) {
        /*
        Задание 2.
         */
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "Жёлтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный", 2020, "Германия");
        Car bMWZ8= new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");

        /*
        Вывод информации об автомобилях.
         */
        System.out.println("Тест задания 2.");
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bMWZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
        System.out.println();

        /*
        Задание 3.
         */
        Car ladaGranta_2 = new Car("", null, 0, "", 0, "");
        Car audiA8_2 = new Car(null, "", -1, null, -20, null);
        Car bMWZ8_2= new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Car kiaSportage_2 = new Car(null, null, 2.4, "Зелёный", 2008, "Корея");
        Car hyundaiAvante_2 = new Car("", "", 1.6, "Серый", 1996, "Япония");

        /*
        Вывод информации об автомобилях.
         */
        System.out.println("Тест задания 3.");
        System.out.println(ladaGranta_2);
        System.out.println(audiA8_2);
        System.out.println(bMWZ8_2);
        System.out.println(kiaSportage_2);
        System.out.println(hyundaiAvante_2);
    }
}