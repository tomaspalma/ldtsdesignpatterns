package org.example;

public class StringBar extends Bar {
    public StringBar() {
        this.happyHour = false;
    }
    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        this.happyHour = true;
        this.notifyObservers();
    }

    @Override
    public void endHappyHour() {
        this.happyHour = false;
        this.notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
