package org.example;

public class StringReplacer implements StringTransformer {

    public StringReplacer(Character char1, Character char2) {
        this.char1 = char1;
        this.char2 = char2;
    }
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(char1, char2));
    }

    Character char1;
    Character char2;
}
