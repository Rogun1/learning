import session9.Course;
import session9.Person;
import session9.Professor;
import session9.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student person1 = new Student(
                "Alex",
                "Cornbu",
                "Masculin",
                37,
                "01.01.1998",
                1029312,
                "Cluj"
                );
        person1.personProfile();

        Professor person2 = new Professor(
                "Raul",
                "Moreanu",
                "Masculin",
                27,
                "18.06.1998",
                198231,
                "Timisoara",
                "Collage"
        );
        person2.personProfile();

        Course math = new Course(
                "Math",
                "01.01.2026",
                "6 months",
                "Some description for math course"
        );
        math.assignProfessor(person2);

        //System.out.println(math.teacherName());
        math.courseDetails();
    }
}
