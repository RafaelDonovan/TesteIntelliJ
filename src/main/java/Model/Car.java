package Model;

public class Car {
    private String id;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car(String id, String carName) {
        this.id = id;
        this.name = carName;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

