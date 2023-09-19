package sampleTest2.problem1.Vaccines;

public class TypeAVaccine extends Vaccine implements UsedByYoung{

    public TypeAVaccine(String name, double amountMl) {
        super(name, amountMl);
        doses = 2;
        daysBetweenTwoDoses = 20;
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
    public String procedureForTheYoung() {
        return name + " is OK for the Young";
    }
}
