package session9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolGradebook {
    public static void main(String[] args) {
        Students student1 = new Students("Raul", Math.random());
        Students student2 = new Students("Alina", Math.random());
        Teachers teacher1 = new Teachers();
        teacher1.addStudent(student1, 0);
        teacher1.addStudent(student2, 0);
        teacher1.studentList();
        System.out.println();
        teacher1.setGrade(student1, 10);
        teacher1.studentList();
        System.out.println();
        teacher1.setGrade(student1, 20);
        teacher1.studentList();
        System.out.println();
        teacher1.setGrade(student2, 100);
        teacher1.studentList();

    }

}

class Students{
    private String name;
    private double uniqID;

    public Students(String name,double uniqID){
        this.name = name;
        this.uniqID = uniqID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUniqID() {
        return uniqID;
    }

    public void setUniqID(double uniqID) {
        this.uniqID = uniqID;
    }

}

class Teachers{
    private List<Students> studentsInClass;
    private List<Double> gradesForStundents;
    private double grade;

    public Teachers(){
        studentsInClass = new ArrayList<>();
        gradesForStundents = new ArrayList<>();
    }

    public void addStudent(Students student, double grade){
        if (studentsInClass.contains(student)){
            System.out.println("Exists already in the class");
        }else {
            studentsInClass.add(student);
            int index = studentsInClass.indexOf(student);
            gradesForStundents.add(index, grade);
        }
    }

    public void setGrade(Students student, double grade){
        int index = studentsInClass.indexOf(student);
        if (index == -1){
            System.out.println("Error");
        }else {
            gradesForStundents.set(index, grade);
        }
    }

    public void studentList(){
        for (Students student: studentsInClass){
            System.out.print(student.getName() + " ");
            int index = studentsInClass.indexOf(student);
            System.out.println(gradesForStundents.get(index));
        }
    }

}