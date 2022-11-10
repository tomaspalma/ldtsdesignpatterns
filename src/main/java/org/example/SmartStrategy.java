package org.example;

public class SmartStrategy implements OrderingStrategy {

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.drink = drink; this.recipe = recipe;

        if(bar.isHappyHour()) {
            bar.order(drink, recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        this.wants(drink, recipe, bar);
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }

    StringDrink drink;
    StringRecipe recipe;
}
