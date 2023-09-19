package sampleTest2.problem1.Vaccines;

public class TypeBVaccine extends Vaccine implements UsedByElderly{
    public TypeBVaccine(String name, double amountMl) {
        super(name, amountMl);
        doses = 2;
        daysBetweenTwoDoses = 30;
    }
    @Override
    public boolean isTwoDoses() {
        return true;
    }

    @Override
    public int daysBetween() {
        return daysBetweenTwoDoses;
    }

    @Override
    public String procedureForTheElderly() {
        return name + " is OK for the Elderly";
    }
}
