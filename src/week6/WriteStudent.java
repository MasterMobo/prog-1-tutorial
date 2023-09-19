package week6;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class WriteStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many records will you add?: ");
        int studentCount = scanner.nextInt();
        StudentList list = new StudentList();
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Adding student number " + (i+1) + "...") ;
            list.addStudent();
        }

        System.out.println(list);
        try (FileOutputStream fos = new FileOutputStream("students.obj")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Student student: list.students) {
                oos.writeObject(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
