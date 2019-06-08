package model;

public enum Ingredients {
    PEPPER("PEPPER"), TOMATO("TOMATO"), CHEESE("CHEESE"), MUSHROOMS("MUSHROOMS"), SAUCE("SAUCE"), HAM("HAM"), SALAMI("SALAMI"), HOT_PEPPER("HOT_PEPPER"), ONION("ONION");

    private String ingredient;

    public String getIngredient() {
        return this.ingredient;
    }

    Ingredients(String ingredient) {
        this.ingredient = ingredient;
    }
}
