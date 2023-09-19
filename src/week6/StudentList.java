package week6;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentList implements Serializable {
    ArrayList<Student> students;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public void addStudent() {
        Student student = Student.createStudent();
        students.add(student);
        System.out.println("Added: " + student);
    }

    @Override
    public String toString() {
        return students.toString();
    }
}
