package week8;

import java.util.ArrayList;
import java.util.Comparator;

public class RecipeSeriousDisplay extends RecipeDisplay {
    public RecipeSeriousDisplay() {
        super();
    }

    @Override
    public void display() {
        ArrayList<RecipeComponent> res = (ArrayList<RecipeComponent>) components.clone();
        res.sort(Comparator.comparing(RecipeComponent::getAmount));
        for (RecipeComponent rc: res) {
            System.out.println(rc);
        }
    }
}
