package pro.sky.java.course1.OOP_Introduction;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setColor(color);
        setYear(year);
        setCountry(country);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
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

    public void setModel(String model) {
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

    public void setYear(int year) {
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country ==null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = country;
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
                ", сборка - " + country;
    }
}
