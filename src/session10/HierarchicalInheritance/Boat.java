package session10.HierarchicalInheritance;

public class Boat {
    private int lenght;
    private int weight;

    public Boat(int lenght,int weight){
        this.lenght = lenght;
        this.weight = weight;
    }

    public void sail(){
        System.out.println("Boat is sailing");
    }
}

class SpeedBoat extends Boat{
    private int maxSpeed;
    private String engineType;

    public SpeedBoat(int lenght, int weight, int maxSpeed, String engineType) {
        super(lenght, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost(){
        System.out.println("Boosting the boat");
    }
}

class FishBoat extends Boat{
    private int fishCapacity;
    private String typeOfNet;

    public FishBoat(int lenght, int weight, int fishCapacity, String typeOfNet) {
        super(lenght, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet(){
        System.out.println("Something");
    }
}
