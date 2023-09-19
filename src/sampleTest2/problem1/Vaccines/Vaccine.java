package sampleTest2.problem1.Vaccines;

public abstract class Vaccine {
    protected String name;
    protected double amountMl;
    protected int doses;

    protected int daysBetweenTwoDoses;

    public abstract boolean isTwoDoses();

    public abstract int daysBetween();

    public Vaccine(String name, double amountMl) {
        this.name = name;
        this.amountMl = amountMl;
    }
}
