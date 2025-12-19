package session10.SingleInheritance;

public class Bicycle {
    private int speed;
    private int gear;

    public Bicycle(int speed,int gear){
        this.speed = speed;
        this.gear = gear;
    }

    public void changeGear(int gear){
        this.gear = gear;
    }

    public void speedUP(int speed){
        this.speed = speed;
    }

    public void applyBreak(){
        this.speed = -1;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}

class MountainBike extends Bicycle{

    private String tyreType;
    private String suspension;

    public MountainBike(int speed, int gear, String tyreType, String suspension) {
        super(speed, gear);
        this.tyreType = tyreType;
        this.suspension = suspension;
    }

    public void adjustSuspension(){
    }

    public String getTyreType() {
        return tyreType;
    }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
}