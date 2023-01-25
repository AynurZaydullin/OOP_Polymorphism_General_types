package pro.sky.java.course2.transport;


public class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color,  int maxSpeed) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setCountry(country);
        setColor(color);
        setMaxSpeed(maxSpeed);
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
    public void setModel(String model) {
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (country ==null || country.equals("")) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return  " " + brand +
                " " + model +
                ", цвет кузова — " + color + '\n' +
                ", год выпуска — " + year +
                ", сборка - " + country  +
                ", Максимальная скорость передвижения - " + maxSpeed
                ;
    }
}
