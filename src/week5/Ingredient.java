package week5;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Ingredient {
    private String name;
    private String measurementUnit;
    private String comment;

    public Ingredient() {
        this.name = "Default";
        this.measurementUnit = "Default";
        this.comment = "Default";
    }

    public Ingredient(String name, String measurementUnit, String comment) {
        this.name = name;
        this.measurementUnit = measurementUnit;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean setMeasurementUnit(String measurementUnit) {
        String[] availableUnits = {"g", "mg", "ml", "l", "teaspoon", "spoon"};
        boolean matched = false;
        for (String unit: availableUnits){
            if (measurementUnit.equals(unit)) {
                matched = true;
                break;
            }
        }

        if (matched){
            this.measurementUnit = measurementUnit;
            return true;
        }
        return false;
    }

    public static Ingredient createIngredient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a new component....");
        System.out.println("Enter the ingredient name: ");
        String name = scanner.next();
        System.out.println("Enter the ingredient measurement unit: ");
        String unit = scanner.next();
        System.out.println("Enter the ingredient comment: ");
        String comment = scanner.next();
        return new Ingredient(name, unit, comment);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", measurementUnit='" + measurementUnit + '\'' +
                '}';
    }

}
