package session11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teams {
    private List<Person> members = new ArrayList<>(Arrays.asList());
    private Person leader;

    public Teams(Person leader){
        this.leader = leader;
        members.add(leader);
    }

    public void addMembers(Person member){
        members.add(member);
    }

    public List<Person> getMembers() {
        return members;
    }

    public Person getLeader() {
        return leader;
    }

    public void setLeader(Person leader) {
        this.leader = leader;
    }
}
