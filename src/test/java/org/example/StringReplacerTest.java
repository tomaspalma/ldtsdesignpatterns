package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringReplacerTest {
    @Test
    void stringReplacer() {
        StringDrink drink = new StringDrink("ABCDABCD");
        StringReplacer sr = new StringReplacer('A', 'X');
        sr.execute(drink);
        Assertions.assertEquals("XBCDXBCD", drink.getText());
    }
}
