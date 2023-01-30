package pro.sky.java.course2.transport;

public abstract class Transport<D extends Driver> {
    private String brand;
    private String model;
    private double engineVolume;
    private D driver;
    public abstract void start();  // метод "Начать движение"
    public abstract void stop();  // метод "Закончить движение"

    public Transport(String brand, String model, double engineVolume, D driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
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

    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return  " " + brand +
                " " + model +
                ", объем двигателя — " + engineVolume + " "
                ;
    }
}