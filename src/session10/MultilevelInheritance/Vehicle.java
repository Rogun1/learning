package session10.MultilevelInheritance;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("Vehicle started");
    }
    public void stop(){
        System.out.println("Vehicle stopped");
    }
    public void accelerate(){
        System.out.println("Vehicle accelerating");
    }
}

class ElectricCar extends Vehicle{
    private int batteryCapacity;
    private int range;

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range){
        super(make,model,year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public void charge(){
        System.out.println("Car is charging");
    }
}

class Tesla extends ElectricCar{
    private int autoPilotVersion;

    public Tesla(String make, String model, int year, int batteryCapacity, int range, int autoPilotVersion) {
        super(make, model, year, batteryCapacity, range);
        this.autoPilotVersion = autoPilotVersion;
    }

    public void enableAutopilot(){
        System.out.println("Autopilot enabled");
    }
}