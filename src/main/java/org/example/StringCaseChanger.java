package org.example;

public class StringCaseChanger implements StringTransformer {
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
          if(Character.isLowerCase(text.charAt(i))) {
              result.append(Character.toUpperCase(text.charAt(i)));
          } else {
              result.append(Character.toLowerCase(text.charAt(i)));
          }
       }
        drink.setText(result.toString());
    }
}
