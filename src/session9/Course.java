package session9;

public class Course {
    private String name;
    private String schedule;
    private String duration;
    private String description;
    private Professor teacher;

    public Course(String name, String schedule, String duration, String description){
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
    }

    public void assignProfessor(Professor person) {
        teacher = person;
    }

    public void courseDetails(){
        System.out.println("Course name: " + name);
        System.out.println("Schedule: " + schedule);
        System.out.println("Duration: " + duration);
        System.out.println("Description: " + description);
        System.out.println("Assigned Professor: " + teacherName());
    }

    public String teacherName(){
        return teacher.fullName();
    }
}
