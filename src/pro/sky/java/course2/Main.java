package pro.sky.java.course2;

import pro.sky.java.course2.transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задание 1.
        Car car1 = new Car("Audi", "A4", 3.0, null, 2000, null,
                "", "car Body Type", -1, 4);
        //Вывод информации об автомобиле.
        System.out.println(car1);
        //Сменяем шины на сезонные.
        car1.changeTires();
        System.out.println(car1.isSummerTires());
        //Проверка: какой месяц на данный момент.
        LocalDate d = LocalDate.now();
        System.out.println(d.getMonthValue());
        //Вывод на печать используемых шин
        System.out.println(car1.getTiresType());
        //Задание 2.
        //Создание экземпляра класса Key.
        Car.Key key1 = car1.new Key(true, true);
        System.out.println(key1.isRemoteEngineStart());
        System.out.println(key1.isKeylessAccess());

    }
}