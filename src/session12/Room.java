package session12;

public class Room {
    private String name;
    private Lights lights;
    private Windows windows;
    private Doors doors;
    private Thermostat thermostat;

    public Room(String name, Lights lights, Windows windows, Doors doors, Thermostat thermostat){
        this.name = name;
        this.lights = lights;
        this.windows = windows;
        this.doors = doors;
        this.thermostat = thermostat;
    }

    public int getTemperature(){
        return thermostat.getTemperature();
    }
    public void setTemperature(int temperature){
        thermostat.setTemperature(temperature);
    }
    public int getLightsIntensity(){
        return lights.getIntensity();
    }
    public void setLightsIntensity(int intensity) {
        lights.setIntensity(intensity);
    }
    public void closeRoomDoors(){
        doors.closeDoors();
    }
    public int getRoomLightsConsumption(){
        return lights.getLightsEnergyConsuming();
    }
    public int getThermostatConsumption(){
        return thermostat.getThermostatEnergyConsuming();
    }
}
