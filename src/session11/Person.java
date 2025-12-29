package session11;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private List<Roles> role = new ArrayList<>();

    public Person(String firstName,String lastName, Roles role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.role.add(role);
    }

    public void personProfile(){
        System.out.println("Person First and Last name: " + fullName());
        System.out.print("Person is an ");
        if (hasRole("admin") && hasRole("manager")){
            System.out.println("admin, manager");
        } else if (hasRole("manager")) {
            System.out.println("manager");
        } else if (hasRole("admin")) {
            System.out.println("admin");
        } else {
            System.out.println("employee");
        }

    }

    public String fullName(){
        return firstName + " " + lastName;
    }

    public void addRole(Roles role){
        if (!this.role.contains(role)) {
            this.role.add(role);
        }
    }

    public void removeRole(Roles role){
        this.role.remove(role);
    }

    public boolean hasRole(String roleName){
        for (Roles rol: role){
            if (rol.getName().equals(roleName)){
                return true;
            }
        }
        return false;
    }

}