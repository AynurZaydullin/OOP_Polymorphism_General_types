package pro.sky.java.course1.OOP_Introduction;

public class Main {
    public static void main(String[] args) {
        /*

        Задание 1.
         */
        Car ladaGranta = new Car();
        ladaGranta.setBrand("Lada");
        ladaGranta.setModel("Granta");
        ladaGranta.setEngineVolume(1.7);
        ladaGranta.setColor("Желтый");
        ladaGranta.setYear(2015);
        ladaGranta.setCountry("Россия");

        Car audiA8 = new Car();
        audiA8.setBrand("Audi");
        audiA8.setModel("A8 50 L TDI quattro");
        audiA8.setEngineVolume(3.0);
        audiA8.setColor("Черный");
        audiA8.setYear(2020);
        audiA8.setCountry("Германия");

        Car bMWZ8= new Car();
        bMWZ8.setBrand("BMW");
        bMWZ8.setModel("Z8");
        bMWZ8.setEngineVolume(3.0);
        bMWZ8.setColor("Черный");
        bMWZ8.setYear(2021);
        bMWZ8.setCountry("Германия");

        Car kiaSportage = new Car();
        kiaSportage.setBrand("Kia");
        kiaSportage.setModel("Sportage 4-го поколения");
        kiaSportage.setEngineVolume(2.4);
        kiaSportage.setColor("Красный");
        kiaSportage.setYear(2018);
        kiaSportage.setCountry("Южная Корея");

        Car hyundaiAvante = new Car();
        hyundaiAvante.setBrand("Hyundai");
        hyundaiAvante.setModel("Avante");
        hyundaiAvante.setEngineVolume(1.6);
        hyundaiAvante.setColor("Оранжевый");
        hyundaiAvante.setYear(2016);
        hyundaiAvante.setCountry("Южная Корея");

        /*
        Вывод информации об автомобилях.
         */
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bMWZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);


    }
}