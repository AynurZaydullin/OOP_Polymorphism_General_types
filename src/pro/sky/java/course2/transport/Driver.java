package pro.sky.java.course2.transport;

public class Driver {
    private String lastName;
    private String name;
    private String middleName;
    private String drivingLicense;
    private String drivingExperience;

    public Driver(String lastName, String name, String middleName, String drivingLicense, String drivingExperience) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.drivingLicense = drivingLicense;
        this.drivingExperience = drivingExperience;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.equals("")) {
            System.out.println("Введите фамилию.");
        }else {
            this.lastName = lastName;
        }
    }

    public String getName() {
        return middleName;
    }

    public void setName(String name) {
        if (name == null || lastName.equals("")) {
            System.out.println("Введите имя.");
        }else {
            this.lastName = name;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (middleName == null || lastName.equals("")) {
            System.out.println("Введите имя.");
        }else {
            this.lastName = middleName;
        }
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        if (drivingLicense == null || lastName.equals("")) {
            System.out.println("Введите имя.");
        }else {
            this.lastName = drivingLicense;
        }
    }

    public String DrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(String drivingExperience) {
        if (drivingExperience == null || drivingExperience.equals("")) {
            System.out.println("Введите категорию водительских прав.");
        }else {
            this.drivingExperience = drivingExperience;
        }
    }
}
