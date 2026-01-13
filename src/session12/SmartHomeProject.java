package session12;

public class SmartHomeProject {
    static void main(String[] args) {
        Home homeRaul = new Home();
        User userRaul = new User("Raul");
        User userAlex = new User("Alex");
        User userElena = new User("Elena");
        User userAnca = new User("Anca");
        User userMerc = new User("Merc");

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
        System.out.println(livingRoom.getWindows());
        System.out.println(thermostat.getTemperature());

        System.out.println(livingRoom.getLightsIntensity());
        homeRaul.nightMode();
        System.out.println(livingRoom.getLightsIntensity());
        System.out.println(thermostat.getTemperature());

        if (livingRoom.getTemperature() < 20){
            livingRoom.setTemperature(24);
        }

        System.out.println(thermostat.getTemperature());

    }
}
