package session11;

import java.util.List;
import java.util.Scanner;

public class Email {
    private final Scanner scanner = new Scanner(System.in);
    private String announcement;

    public Email(){
    }

    public void write(){
        System.out.println("Write the email announcement for the employers:");
        announcement = scanner.nextLine();
    }

    public void send(List<Person> employers){
        for (Person employer: employers){
            System.out.println("Hi " + employer.fullName() + " this is an email from the company.");
            System.out.println(announcement);
            System.out.println();
        }
    }
}
