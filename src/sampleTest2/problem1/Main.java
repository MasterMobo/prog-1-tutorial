package sampleTest2.problem1;

import sampleTest2.problem1.Vaccines.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Khoa 1", 16);
        Person p2 = new Person("Khoa 2", 25);
        Person p3 = new Person("Khoa 3", 50);
        Person p4 = new Person("Khoa 4", 70);

        Vaccine a;
        Vaccine b;
        Vaccine c;
        Vaccine d;

        a = new TypeAVaccine("va", 55);
        b = new TypeBVaccine("vb", 20);
        c = new TypeCVaccine("vc", 22);
        d = new TypeDVaccine("vd", 44);

        try {
            p1.getVaccine(a);
            p2.getVaccine(b);
            p3.getVaccine(c);
            p4.getVaccine(d);
        } catch (InvalidVaccineTypeException e) {
            e.printStackTrace();
        }

    }
}
