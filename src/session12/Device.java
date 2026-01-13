package session12;

public abstract class Device {
    private String name;

    Device(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void open();
    public abstract void close();
    public abstract boolean isOpened();
}


class Lights extends Device{
    private int intensity;
    private int lightsNumber;
    private boolean isOpen;

    Lights(String name, int lightsNumber) {
        super(name);
        this.lightsNumber = lightsNumber;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getIntensity(){
        return intensity;
    }

    public void setLightsNumber(int lightsNumber) {
        this.lightsNumber = lightsNumber;
    }

    public int getLightsNumber() {
        return lightsNumber;
    }

    @Override
    public void open(){
        System.out.println("Lights opens");
    }

    @Override
    public void close(){
        System.out.println("Lights closes");
    }

    @Override
    public boolean isOpened(){
        return isOpen;
    }
}

class Doors extends Device{
    private int doorsNumber;
    private boolean isOpen;

    Doors(String name, int doorsNumber) {
        super(name);
        this.doorsNumber = doorsNumber;
    }

    @Override
    public void open(){
        System.out.println("Door opens");
        isOpen = true;
    }

    @Override
    public void close(){
        System.out.println("Door closes");
        isOpen = false;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    @Override
    public boolean isOpened(){
        return isOpen;
    }
}

class Windows extends Device{
    private int windowsNumber;
    private boolean isOpen;

    Windows(String name, int windowsNumber) {
        super(name);
        this.windowsNumber = windowsNumber;
    }

    public void setWindowsNumber(int windowsNumber) {
        this.windowsNumber = windowsNumber;
    }

    public int getWindowsNumber() {
        return windowsNumber;
    }

    @Override
    public void open(){
        System.out.println("Window opens");
        isOpen = true;
    }

    @Override
    public void close(){
        System.out.println("Window closes");
        isOpen = false;
    }

    @Override
    public boolean isOpened(){
        return isOpen;
    }
}

class Thermostat extends Device{
    private int temperature;
    private boolean isOpen;

    Thermostat(String name, int temperature){
        super(name);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void open(){
        System.out.println("Thermostat opens");
        isOpen = true;
    }

    @Override
    public void close(){
        System.out.println("Thermostat closes");
        isOpen = false;
    }

    @Override
    public boolean isOpened(){
        return isOpen;
    }
}