package factory;

interface Vehicle {
    void display();
}

public class Main {
    public static void main(String[] args) {

        var roadTransport = new RoadTransport();

        roadTransport.createVehicle().display();

        var seaTransport = new SeaTransport();

        seaTransport.createVehicle().display();
    }
}

abstract class Transport {
    abstract Vehicle createVehicle();
}

class SeaTransport extends Transport {

    Vehicle createVehicle() {
        return new Boat("Boat");
    }
}

class RoadTransport extends Transport {

    Vehicle createVehicle() {
        return new Truck("Truck");
    }
}

class Truck implements Vehicle {

    private final String type;

    public Truck(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Type : " + type);
    }
}

class Boat implements Vehicle {

    private final String type;

    public Boat(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Type : " + type);
    }

}