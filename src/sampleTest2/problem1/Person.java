package sampleTest2.problem1;

import sampleTest2.problem1.Vaccines.InvalidVaccineTypeException;
import sampleTest2.problem1.Vaccines.UsedByElderly;
import sampleTest2.problem1.Vaccines.UsedByYoung;
import sampleTest2.problem1.Vaccines.Vaccine;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getVaccine(Vaccine v) throws InvalidVaccineTypeException {
        // Invalid young people
        if (age < 18 && !(v instanceof UsedByYoung)) {
            throw new InvalidVaccineTypeException();
        }

        // Invalid elderly people
        if (age > 65 && !(v instanceof UsedByElderly)) {
            throw new InvalidVaccineTypeException();
        }

        if (!v.isTwoDoses()) {
            System.out.println(name + ", you need only one dose");
            return;
        }

        System.out.println(name + ", you will get the second dose after " + v.daysBetween() + " days");
    }
}
