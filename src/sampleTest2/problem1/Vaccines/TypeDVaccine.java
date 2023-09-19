package sampleTest2.problem1.Vaccines;

public class TypeDVaccine extends Vaccine implements UsedByElderly{
    public TypeDVaccine(String name, double amountMl) {
        super(name, amountMl);
        doses = 1;
    }
    @Override
    public boolean isTwoDoses() {
        return false;
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
