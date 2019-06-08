package builders;

import lombok.NoArgsConstructor;
import model.Ingredients;
import model.Pizza;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
public class PizzaBuilder {
    private String name;
    private Set<Ingredients> ingredients = new HashSet<Ingredients>();
    private int spiciness;

    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder setIngredients(Ingredients ingredient) {
        this.ingredients.add(ingredient);
        return this;
    }

    public PizzaBuilder setSpiciness(int spiciness) {
        this.spiciness = spiciness;
        return this;
    }

    public Pizza buildPizza() {
        return new Pizza(this.name, this.ingredients, this.spiciness);
    }

}
