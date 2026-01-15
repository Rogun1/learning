package session12;

public class Device implements Lights,Doors,Windows,Thermostat{
    private String name;
    private static int lightsIntensity = 30;
    private static int lightsEnergyConsuming = 15;
    private static int doorNumber = 0;
    private static int windowsNumber = 0;
    private static int thermostatEnergyConsuming = 25;
    private static int thermostatTemperature = 0;
    private boolean isLightsOpen;
    private boolean isDoorsOpen;
    private boolean isWindowsOpen;
    private boolean isThermostatOpen;

    Device(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void setIntensity(int intensity) {
        lightsIntensity = intensity;
    }

    @Override
    public int getIntensity() {
        return lightsIntensity;
    }

    public int getLightsEnergyConsuming() {
        return lightsEnergyConsuming;
    }

    @Override
    public void setDoorsNumber(int doorNumber) {
        this.doorNumber += doorNumber;
    }

    @Override
    public int getDoorsNumber() {
        return doorNumber;
    }

    @Override
    public void setWindowsNumber(int windowsNumber) {
        this.windowsNumber += windowsNumber;
    }

    @Override
    public int getWindowsNumber() {
        return windowsNumber;
    }

    @Override
    public void setTemperature(int temperature) {
        thermostatTemperature += temperature;
    }

    @Override
    public int getTemperature() {
        return thermostatTemperature;
    }

    public int getThermostatEnergyConsuming() {
        return thermostatEnergyConsuming;
    }

    @Override
    public void openLights() {
        System.out.println("Lights opened");
        isLightsOpen = true;
        lightsIntensity = 30;
        lightsEnergyConsuming += 10;
    }

    public boolean isLightsOpen() {
        return isLightsOpen;
    }

    @Override
    public void openDoors() {
        System.out.println("Doors opened");
        isDoorsOpen = true;
    }

    public boolean isDoorsOpen() {
        return isDoorsOpen;
    }

    @Override
    public void openWindows() {
        System.out.println("Windows opened");
        isWindowsOpen = true;
    }

    public boolean isWindowsOpen() {
        return isWindowsOpen;
    }

    @Override
    public void openThermostat() {
        System.out.println("Thermostats opened");
        isThermostatOpen = true;
        thermostatEnergyConsuming += 18;
    }

    public boolean isThermostatOpen() {
        return isThermostatOpen;
    }

    @Override
    public void closeLights() {
        System.out.println("Lights closed");
        isLightsOpen = false;
        lightsIntensity = 0;
    }

    @Override
    public void closeDoors() {
        System.out.println("Doors closed");
        isDoorsOpen = false;
    }

    @Override
    public void closeWindows() {
        System.out.println("Windows closed");
        isWindowsOpen = false;
    }

    @Override
    public void closeThermostat() {
        System.out.println("Thermostats closed");
        isThermostatOpen = false;
    }
}

interface Lights{
    public void setIntensity(int intensity);
    public int getIntensity();
    public void openLights();
    public void closeLights();
    public int getLightsEnergyConsuming();
}

interface Doors{
    public void setDoorsNumber(int doorsNumber);
    public int getDoorsNumber();
    public void openDoors();
    public void closeDoors();
}

interface Windows{
    public void setWindowsNumber(int windowsNumber);
    public int getWindowsNumber();
    public void openWindows();
    public void closeWindows();
}

interface Thermostat{
    public int getTemperature();
    public void setTemperature(int temperature);
    public void openThermostat();
    public void closeThermostat();
    public int getThermostatEnergyConsuming();
}