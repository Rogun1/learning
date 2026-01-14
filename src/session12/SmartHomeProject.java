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
        int outsideTemperature = 19;

        homeRaul.setHomeOnwer(userRaul);
        homeRaul.setFamilyMember(userAlex);
        homeRaul.setGuest(userElena);
        homeRaul.setGuest(userAnca);
        homeRaul.setGuest(userMerc);

        homeRaul.getUsers();
        System.out.println();
        System.out.println(userRaul.getAccesLevel());

        Lights lights = new Lights("Light", 10);
        Doors doors = new Doors("Door", 3);
        Windows windows = new Windows("Windows", 8);
        Thermostat thermostat = new Thermostat("Thermostat 1", 30);

        homeRaul.setDevice(lights);
        homeRaul.setDevice(windows);
        homeRaul.setDevice(doors);
        homeRaul.setDevice(thermostat);

        homeRaul.getDevices();

        Room livingRoom = new Room("Living Room",lights,windows,doors,thermostat);

        System.out.println();
        System.out.println(livingRoom.getLights());

        homeRaul.setLivingRoom(livingRoom);
        System.out.println(homeRaul.getLivingRoom().getName());
        System.out.println("Living room windiws: " + livingRoom.getWindows());
        System.out.println("Thermostat temperature: " + thermostat.getTemperature());

        System.out.println("Living Room lights intensity: " + livingRoom.getLightsIntensity());
        //homeRaul.nightMode();
        System.out.println("Living Room lights intensity: " + livingRoom.getLightsIntensity());
        System.out.println("Thermostat temperature: " + thermostat.getTemperature());

        System.out.println("Outside temperature: " + outsideTemperature);
        if (outsideTemperature < 20){
            livingRoom.setTemperature(24);
            System.out.println("Temperature went under 20 degrees, set the temperature to: " + livingRoom.getTemperature());
        }

        System.out.println("Thermostat temperature: " + thermostat.getTemperature());
        //Individual energy consumtion check
        System.out.println("Lights consumption: " + lights.getTotalEnergyConsumed());
        System.out.println("Thermostat consumption: " + thermostat.getTotalEnergyComsumption());
        lights.open();
        thermostat.open();
        System.out.println("Lights consumption: " + lights.getTotalEnergyConsumed());
        System.out.println("Thermostat consumption: " + thermostat.getTotalEnergyComsumption());
        //Full room energy check
        System.out.println("Full room consumption: " + homeRaul.fullEnergyConsumptionRaport());

        if (lights.isOpened()){
            lights.setEnergyConsumed(20);
        }
        if (thermostat.isOpened()){
            thermostat.setEnergyConsumed(35);
        }
        System.out.println("After opening");
        System.out.println("Lights consumption: " + lights.getTotalEnergyConsumed());
        System.out.println("Thermostat consumption: " + thermostat.getTotalEnergyComsumption());
        //Full room energy check
        System.out.println("Full room consumption: " + homeRaul.fullEnergyConsumptionRaport());

        //Simulate that there are no people in living room for more then 10 minutes.
        System.out.println("There is no one in living room, recommend energy saving mode");
        homeRaul.energySaving();
        System.out.println("Living Room lights intensity: " + livingRoom.getLightsIntensity());

        //Simulating report
        System.out.println("Total lights energy consumption: " + lights.getTotalEnergyConsumed());
        System.out.println("Total thermostat energy consumption: " + thermostat.getTotalEnergyComsumption());
        //I can't keep track of savings, i don't have any idea here.
        System.out.println("Total energy consumption: " + homeRaul.fullEnergyConsumptionRaport());
    }
}
