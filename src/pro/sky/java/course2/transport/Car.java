package pro.sky.java.course2.transport;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String carBodyType;
    private int registrationNumber;
    private final int DEFAULT_REGISTRATION_NUMBER = 0;
    private int numberOfSeats;
    private final int DEFAULT_NUMBER_OF_SEATS = 2;
    boolean isSummerTires;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String carBodyType, int registrationNumber, int numberOfSeats) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setColor(color);
        setYear(year);
        setCountry(country);
        setTransmission(transmission);
        setCarBodyType(carBodyType);
        setRegistrationNumber(registrationNumber);
        setNumberOfSeats(numberOfSeats);
    }

    public String getBrand() {
        return brand;
    }

    /*
    Модификатор доступа private позволяет защитить от изменение поле "brand"
     */
    private void setBrand(String brand) {
        if (brand ==null || brand.equals("")){
            this.brand = "default";
        }
        else{
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }
    /*
    Модификатор доступа private позволяет защитить от изменение поле "model"
     */
    private void setModel(String model) {
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color ==null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }
    /*
    Модификатор доступа private позволяет защитить от изменение поле "model"
     */
    private void setYear(int year) {
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public String getCountry() {
        return country;
    }
    /*
    Модификатор доступа private позволяет защитить от изменение поле "country"
     */
    private void setCountry(String country) {
        if (country ==null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.equals("")) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public String getCarBodyType() {
        return carBodyType;
    }
    /*
    Модификатор доступа private позволяет защитить от изменение поле "carBodyType"
     */
    private void setCarBodyType(String carBodyType) {
        if (carBodyType == null || carBodyType.equals("")) {
            this.carBodyType = "default";
        } else {
            this.carBodyType = carBodyType;
        }
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        if (registrationNumber < 0) {
            this.registrationNumber = DEFAULT_REGISTRATION_NUMBER;
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    /*
    Модификатор доступа private позволяет защитить от изменение поле "numberOfSeats"
     */
    private void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats < 2) {
            this.numberOfSeats = DEFAULT_NUMBER_OF_SEATS;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
    }

    public boolean isSummerTires() {
        return isSummerTires;
    }

    public String getTiresType() {
        if (isSummerTires == true) {
            return "Summer tires";
        }
        return "Winter tires.";
    }

    //Устанавливаем шины, соотвествующие сезону.
    public void changeTires() {
        LocalDate d = LocalDate.now();
        switch (d.getMonthValue()) {
            case 11 :
            case 12 :
            case 1 :
            case 2 :
            case 3 :
            case 4 : isSummerTires = false;
                break;
            case 5 :
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 : isSummerTires = true;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + d.getMonthValue());
        }
    }
    @Override
    public String toString() {
        return "Автомобиль" +
                " " + brand +
                " " + model +
                ", объем двигателя — " + engineVolume +
                ", цвет кузова — " + color +
                ", год выпуска — " + year +
                ", сборка - " + country + '\n' +
                "трансмиссия - " + transmission +
                ", тип кузова - " + carBodyType +
                ", регистрационный номер - " + registrationNumber +
                ", количество мест - " + numberOfSeats
                ;
    }

    public class Key {
        private boolean isRemoteEngineStart;
        private boolean isKeylessAccess;

        public Key(boolean isRemoteEngineStart, boolean isKeylessAccess) {
            setRemoteEngineStart(isRemoteEngineStart);
            setKeylessAccess(isKeylessAccess);
        }

        public boolean isRemoteEngineStart() {
            return isRemoteEngineStart;
        }

        public void setRemoteEngineStart(boolean RemoteEngineStart) {
            if (RemoteEngineStart == true || RemoteEngineStart == false) {
                isRemoteEngineStart = RemoteEngineStart;
            } else {
                throw new IllegalStateException("Unexpected value: " + RemoteEngineStart);
            }
        }

        public boolean isKeylessAccess() {
            return isKeylessAccess;
        }

        public void setKeylessAccess(boolean KeylessAccess) {
            if (KeylessAccess == true || KeylessAccess == false) {
                isKeylessAccess = KeylessAccess;
            } else {
                throw new IllegalStateException("Unexpected value: " + KeylessAccess);
            }
        }
    }
}
