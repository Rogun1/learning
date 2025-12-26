package session11;

import session11.Person;

import java.util.List;

public class Roles {

    //ASked chatgpt how can i do this, i still did not know how so i was helped here
    public static final String admin = "admin";
    public static final String manager = "manager";
    public static final String employee = "employee";

    private final String name;

    public Roles(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
