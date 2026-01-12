package session12;

import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<User> users;
    public enum accesLevel{
        FULL,
        PARTIAL,
        LIMITED
    }
    private List<Device> devices;
    private Room livingRoom;

    public Home(){
        users = new ArrayList<>();
        devices = new ArrayList<>();
    }

    public void setHomeOnwer(User user){
        user.setAccesLevel(accesLevel.FULL);
        users.add(user);
    }

    public void setFamilyMember(User user){
        user.setAccesLevel(accesLevel.PARTIAL);
        users.add(user);
    }

    public void setGuest(User user){
        user.setAccesLevel(accesLevel.LIMITED);
        users.add(user);
    }

    public void setDevice(Device device){
        devices.add(device);
    }

    public void setLivingRoom(Room livingRoom) {
        this.livingRoom = livingRoom;
    }

    public void getDevices(){
        for (Device device: devices){
            System.out.print(device.getName() + ", ");
        }
    }

    public void getUsers() {
        for (User user: users){
            System.out.print(user.getUserName() + ", ");
        }
    }

    public Room getLivingRoom() {
        return livingRoom;
    }

    public void nightMode(){
        livingRoom.setLightsIntensity(10);
        for (Device device: devices){
            if (device.getName().equals("Door")){
                if (device.isOpened()){
                    device.close();
                }
            }
        }
        livingRoom.setTemperature(24);
        System.out.println();
    }
}

class User{
    private String userName;
    private Home.accesLevel accesLevel;

    public User(String userName){
        this.userName = userName;
    }

    public void setAccesLevel(Home.accesLevel accesLevel){
        this.accesLevel = accesLevel;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public Home.accesLevel getAccesLevel(){
        return accesLevel;
    }
}
