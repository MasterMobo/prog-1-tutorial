package sampleTest2.problem1.Vaccines;

public class InvalidVaccineTypeException extends Exception{
    public InvalidVaccineTypeException() {
        super("Vaccine is not suitable");
    }
}
