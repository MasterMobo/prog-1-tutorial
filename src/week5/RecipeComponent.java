package week5;

import java.util.Scanner;

public class RecipeComponent {
    private float amount;
    private Ingredient ingredient;

    public RecipeComponent() {
        this.amount = 0;
        this.ingredient = null;
    }

    public RecipeComponent(float amount, Ingredient ingredient) {
        this.amount = amount;
        this.ingredient = ingredient;
    }


    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public static RecipeComponent createRecipeComponent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        float amount = scanner.nextFloat();
        Ingredient ingredient = Ingredient.createIngredient();
        return new RecipeComponent(amount, ingredient);
    }
    @Override
    public String toString() {
        return "RecipeComponent{" +
                "amount=" + amount +
                ", ingredient=" + ingredient +
                '}';
    }


}
