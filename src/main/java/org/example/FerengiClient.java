package org.example;

public class FerengiClient extends AlienClient {

    public FerengiClient() {
        
    }

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return null;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {

    }
}
