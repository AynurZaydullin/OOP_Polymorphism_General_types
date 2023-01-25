package pro.sky.java.course2.transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String carBodyType;
    private int registrationNumber;
    private final int DEFAULT_REGISTRATION_NUMBER = 0;
    private int numberOfSeats;
    private final int DEFAULT_NUMBER_OF_SEATS = 2;
    boolean isSummerTires;


    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String carBodyType, int registrationNumber, int numberOfSeats,  int maxSpeed) {
        super(brand, model, year, country, color,  maxSpeed);
        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setCarBodyType(carBodyType);
        setRegistrationNumber(registrationNumber);
        setNumberOfSeats(numberOfSeats);
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
        if (isSummerTires) {
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
        return "Автомобиль" + super.toString() + " " +
                ", объем двигателя — " + engineVolume +
                "трансмиссия - " + transmission + '\n' +
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
