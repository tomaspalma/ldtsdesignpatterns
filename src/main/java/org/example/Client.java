package org.example;

public interface Client extends BarObserver {
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar);3
}
