package week8;

import java.util.Arrays;

public class Recipe {
    private String name;
    private RecipeComponent[] listComponent;
    private int number;

    private static int totalRecipies;

    public Recipe() {
        this.name = "Default";
        this.number = 0;
        this.listComponent = null;
        totalRecipies++;
    }

    public Recipe(String name, int number) {
        this.name = name;
        this.number = number;
        listComponent = new RecipeComponent[number];
        totalRecipies++;
    }

    public String getName() {
        return name;
    }

    public void addComponent(int index){
        listComponent[index] = RecipeComponent.createRecipeComponent();;
    }

    public void display(){
        System.out.println(name + " (Recipe)");
        for (RecipeComponent rc: listComponent){
            System.out.println(rc);
            System.out.println("-------------");
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getTotalRecipies() {
        return totalRecipies;
    }
    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", listComponent=" + Arrays.toString(listComponent) +
                ", number=" + number +
                '}';
    }
}
