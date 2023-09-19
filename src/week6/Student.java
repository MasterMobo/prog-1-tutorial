package week6;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    public static void main(String[] args) {
        Student student = Student.createStudent();
        System.out.println(student);
    }
    String name;
    String address;
    int age;

    public Student() {
    }

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter address: ");
        String address = scanner.nextLine().trim();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        return new Student(name, address, age);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age;
    }
}
