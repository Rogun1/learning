package session9;

public class Professor extends Person {

    private String grads;

    public Professor(String firstName, String lastName, String sex, int age, String dateOfBirth, int cnp, String address, String grads) {
        super(firstName, lastName, sex, age, dateOfBirth, cnp, address);
        this.grads = grads;
    }

    @Override
    public void personProfile(){
        super.personProfile();
        System.out.println("Person grads: " + grads);
    }

}
