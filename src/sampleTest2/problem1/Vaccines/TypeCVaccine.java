package sampleTest2.problem1.Vaccines;

public class TypeCVaccine extends Vaccine implements UsedByYoung{
    public TypeCVaccine(String name, double amountMl) {
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
    public String procedureForTheYoung() {
        return name + " is OK for the Young";
    }
}
