package session9;

public class Person {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private int cnp;
    private String address;

    public Person(String firstName,String lastName,String sex,int age,String dateOfBirth,int cnp, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cnp = cnp;
        this.address = address;
    }

    public void personProfile(){
        System.out.println("Person First and Last name: " + firstName + " " + lastName);
        System.out.println("Person sex: " + sex);
        System.out.println("Person age: " + age);
        System.out.println("Person date of birth: " + dateOfBirth);
        System.out.println("Person CNP: " + cnp);
        System.out.println("Person address: " + address);
    }

    public String fullName(){
        return firstName + " " + lastName;
    }
}
