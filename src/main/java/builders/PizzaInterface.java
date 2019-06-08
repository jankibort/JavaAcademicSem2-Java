package builders;

import builders.PizzaBuilder;
import model.Ingredients;

public interface PizzaInterface {
    public PizzaBuilder setName(String name);
    public PizzaBuilder setIngredients(Ingredients ingredients);
    public PizzaBuilder setSpiciness(int spiciness);
}
