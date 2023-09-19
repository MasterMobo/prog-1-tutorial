package week8;

import java.util.ArrayList;

public class RecipeDisplay {
    ArrayList<RecipeComponent> components;

    public RecipeDisplay() {
        components = new ArrayList<>();
    }

    public void addComponent(RecipeComponent rc) {
        components.add(rc);
    }

    public void display() {
    }
}
