package org.example;

public class FerengiClient extends AlienClient {

    public FerengiClient() {
        this.strategy = new SmartStrategy();
    }

    @Override
    public void happyHourStarted(Bar bar) {
        strategy.happyHourStarted((StringBar) bar);
    }

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }

    private OrderingStrategy strategy;
}
