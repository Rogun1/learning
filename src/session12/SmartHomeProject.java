package session12;

public class SmartHomeProject {
    static void main(String[] args) {
        Home homeRaul = new Home();
        User userRaul = new User("Raul");
        User userAlex = new User("Alex");
        User userElena = new User("Elena");
        User userAnca = new User("Anca");
        User userMerc = new User("Merc");
        //Simulating outside temperature
        int outsideTemperature = 17;

        homeRaul.setHomeOnwer(userRaul);
        homeRaul.setFamilyMember(userAlex);
        homeRaul.setGuest(userElena);
        homeRaul.setGuest(userAnca);
        homeRaul.setGuest(userMerc);

        homeRaul.getUsers();
        System.out.println();
        System.out.println(userRaul.getAccesLevel());

        Device lights = new Device("Light");
        Device doors = new Device("doors");
        Device windows = new Device("windows");
        Device thermostats = new Device("thermostat");

        homeRaul.setDevice(lights);
        homeRaul.setDevice(windows);
        homeRaul.setDevice(doors);
        homeRaul.setDevice(thermostats);
        homeRaul.getDevices();

        Room livingRoom = new Room("Living Room",lights,windows,doors,thermostats);

        System.out.println();
        homeRaul.setLivingRoom(livingRoom);

        //System.out.println("Living Room lights intensity: " + livingRoom.getLightsIntensity());
        //homeRaul.nightMode();
        System.out.println("Living Room lights intensity: " + livingRoom.getLightsIntensity());
        System.out.println("Thermostat temperature: " + thermostats.getTemperature());

        System.out.println("Outside temperature: " + outsideTemperature);
        if (outsideTemperature < 20){
            livingRoom.setTemperature(24);
            System.out.println("Temperature went under 20 degrees, set the temperature to: " + livingRoom.getTemperature());
        }

        System.out.println("Thermostat temperature: " + thermostats.getTemperature());
        //Individual energy consumtion check
        System.out.println("Lights consumption: " + lights.getLightsEnergyConsuming());
        System.out.println("Thermostat consumption: " + thermostats.getThermostatEnergyConsuming());
        lights.openLights();
        thermostats.openThermostat();
        System.out.println("Lights consumption: " + lights.getLightsEnergyConsuming());
        System.out.println("Thermostat consumption: " + thermostats.getThermostatEnergyConsuming());
        //Full room energy check
        System.out.println("Full consumption report 1: " + homeRaul.fullEnergyConsumptionRaport());

        lights.openLights();
        thermostats.openThermostat();
        System.out.println("After opening");
        System.out.println("Lights consumption: " + lights.getLightsEnergyConsuming());
        System.out.println("Thermostat consumption: " + thermostats.getThermostatEnergyConsuming());
        //Full room energy check
        System.out.println("Full consumption report 2: " + homeRaul.fullEnergyConsumptionRaport());

        //Simulate that there are no people in living room for more then 10 minutes.
        System.out.println("There is no one in living room, recommend energy saving mode");
        System.out.println("Living Room lights intensity before energySaving: " + livingRoom.getLightsIntensity());
        homeRaul.energySaving();
        System.out.println("Living Room lights intensity after energySaving: " + livingRoom.getLightsIntensity());
    }
}
