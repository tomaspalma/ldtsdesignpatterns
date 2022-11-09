package org.example;

import java.util.List;

public class StringRecipe {
    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void mix(StringDrink drink) {
        for(StringTransformer transformer: transformers) {
            transformer.execute(drink);
        }
    }

    private final List<StringTransformer> transformers;

}
