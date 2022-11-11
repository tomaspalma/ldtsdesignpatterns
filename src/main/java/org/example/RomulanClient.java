package org.example;

public class RomulanClient extends AlienClient {

    public RomulanClient() {
        this.strategy = new ImpatientStrategy();
    }

    @Override
    public void happyHourStarted(Bar bar) {
        strategy.happyHourStarted((StringBar) bar);
    }

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return this.strategy;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }

    OrderingStrategy strategy;
}
