package week8;

public class Main {
    public static void main(String[] args) {
        RecipeSeriousDisplay rdp = new RecipeSeriousDisplay();
        rdp.addComponent(new RecipeComponent(54.4f, new Ingredient("blood", "ml", "")));
        rdp.addComponent(new RecipeComponent(12.4f, new Ingredient("cum", "ml", "")));
        rdp.addComponent(new RecipeComponent(30.6f, new Ingredient("piss", "ml", "")));
        rdp.addComponent(new RecipeComponent(2.6f, new Ingredient("tears", "ml", "")));
        rdp.display();

    }
}
