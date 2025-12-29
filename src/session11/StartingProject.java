package session11;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StartingProject {
    static void main(String[] args) {
        Roles roleEmployee = new Roles(Roles.employee);
        Roles roleAdmin = new Roles(Roles.admin);
        Roles roleManager = new Roles(Roles.manager);

        //Every person has an employee role
        Person person1 = new Person("Raul", "Mrn", roleEmployee);
        Person person2 = new Person("Alin", "Alc", roleEmployee);
        Person person3 = new Person("Bursuc", "Zns", roleEmployee);
        Person person4 = new Person("Hesus", "Mna", roleEmployee);
        Person person5 = new Person("Patru", "Njel", roleEmployee);
        Person person6 = new Person("Anan", "nas", roleEmployee);
        Person person7 = new Person("Ccuas", "Wasdy", roleEmployee);
        Person person8 = new Person("Nbqw", "Wqbs", roleEmployee);

        //List for every role
        List<Person> employers = new ArrayList<>(Arrays.asList());
        List<Person> admins = new ArrayList<>(Arrays.asList());
        List<Person> managers = new ArrayList<>(Arrays.asList());

        //Construction
//        Construction building = new Construction();

        //Resources
        Resource brick = new Resource("brick", 2, 50);
        Resource wood = new Resource("wood", 100, 500);
        Resource metal = new Resource("metal", 100, 100);

        //Send emails.
        Email email = new Email();

        //Just the person1 is the manager,admin and employee
        //Simulating that we have accounts, each account is atleast a employee
        person1.addRole(roleManager);
        person1.addRole(roleAdmin);
        managers.add(person1);
        employers.add(person1);
        admins.add(person1);

        employers.add(person2);
        employers.add(person3);
        employers.add(person4);
        employers.add(person5);
        employers.add(person6);
        employers.add(person7);
        employers.add(person8);

        person1.personProfile();

        //I could just do if statement without for loop.
        //I should have an authenticator and based on the account ID by example, to check if is a manager .
        for (Person person: employers){
            if (person.hasRole("manager")){
                Scanner scanner = new Scanner(System.in);
                System.out.println("You are a manager.");
                System.out.print("See manager Things? y/n : ");
                String answer = scanner.next();

                if (answer.equals("y")){
                    System.out.println("Employers: ");
                    for (Person p: employers){
                        System.out.print(p.fullName() + ", ");
                    };
                    //Creating new teams with a leader
                    Teams team1 = new Teams(person1);
                    Teams team2 = new Teams(person3);
                    Teams team3 = new Teams(person4);
                    List<Teams> teams = new ArrayList<>(Arrays.asList());

                    teams.add(team1);
                    teams.add(team2);
                    teams.add(team3);
                    team1.addMembers(person2);
                    team1.addMembers(person5);
                    team1.addMembers(person6);
                    team2.addMembers(person4);
                    team2.addMembers(person7);
                    team2.addMembers(person8);
                    team3.addMembers(person1);
                    team3.addMembers(person2);
                    team3.addMembers(person3);

                    System.out.println();
                    System.out.println();
                    checkTeam(teams);
                    team1.setLeader(person2);
                    checkTeam(teams);
                    System.out.println();

                    brick.setAvailable(brick);
                    wood.setAvailable(wood);
                    metal.setAvailable(metal);
                    brick.getAvailable();
                    wood.getAvailable();
                    metal.getAvailable();
                    System.out.println();

                    brick.setQuantity(30);
                    System.out.println();
                    brick.getAvailable();
                    wood.getAvailable();
                    metal.getAvailable();
                    System.out.println();
                    System.out.print("Quantity needed for " + brick.getName() + " : " + brick.getQuantityNeeded());
                    System.out.println();
                    wood.setQuantityNeeded(120);
                    System.out.println();
                    System.out.print("Quantity needed for " + brick.getName() + " : " + wood.getQuantityNeeded());
                    System.out.println();
                    brick.getAvailable();
                    wood.getAvailable();
                    metal.getAvailable();
                    System.out.println();

                    System.out.print("Do you want to send an email to employers? y/n:");
                    answer = scanner.next();
                    if (answer.equals("y")){
                        email.write();
                        email.send(employers);
                    }else {
                        System.out.println("No emails to send today.");
                    }
                }
            }
            else {
                System.out.println(person.fullName() + " you have no access to employers");
            }
        }
    }
    public static void checkTeam(List<Teams> team){
        //Counting the numbers of teams, starting with 1 team
        int count = 1;
        for (Teams teams: team) {
            System.out.println("Team: " + count);
            for (Person person : teams.getMembers()) {
                if (person == teams.getLeader()) {
                    System.out.println(person.fullName() + " (TEAM LEADER)");
                }else {
                    System.out.println(person.fullName());
                }
            }
            count++;
            System.out.println();
        }
    }
}