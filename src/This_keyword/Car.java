package This_keyword;

public class Car {
    private String model;
    private Engine engine;

    // Car Constructor
    public Car(String model) {
        this.model = model;
        this.engine = new Engine(this); // Pass current Car object to Engine
    }

    public String getModel() {
        return model;
    }

    public void start() {
        engine.ignite(); // Engine uses Car's data
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model 3");
        myCar.start();
    }
}
 class Engine {
    private Car car; // Holds reference to the Car

    // Engine Constructor (takes Car as argument)
    public Engine(Car car) {
        this.car = car;
    }

    public void ignite() {
        System.out.println("Starting engine of " + car.getModel()); // Accesses Car's model
    }
}
