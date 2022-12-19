import mathematics.MultiplicationTable;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product banana = new Product("Банан", 59, 1);
        Product pineapple = new Product("Ананас", 138, 1);
        Product apple = new Product("Яблоко", 72, 1);
        Product egg = new Product("Яйцо куриное", 68, 1);
        Product biff = new Product("Говядина, вырезка", 570, 1);
        Product sausage = new Product("Сосиски свиные", 154, 1);
        Product cheese = new Product("Сыр", 553, 1);
        Product cookies = new Product("Печенье", 187, 1);
        Product butter = new Product("Масло сливочное", 400, 1);
        Product bread = new Product("Холеб", 48, 1);
        Product carrot = new Product("Морковь", 43, 1);
        Product potato = new Product("Картофель", 25, 1);
        Product candy = new Product("Конфеты шоколадные", 465, 1);
        Product chicken = new Product("Курица, бедро", 350, 1);
        Product tomato = new Product("Томаты", 160, 1);

        HashMap<String, Integer> recipe = new HashMap<>();
        recipe.put("Банан", 59);
        recipe.put("Ананас", 138);
        recipe.put("Яблоко", 72);
        recipe.put("Яйцо куриное", 68);
        recipe.put("Говядина, вырезка", 570);
        recipe.put("Сосиски свиные", 154);
        recipe.put("Сыр", 553);
        recipe.put("Печенье", 187);
        recipe.put("Масло сливочное", 400);
        recipe.put("Хлеб", 48);
        recipe.put("Морковь", 43);
        recipe.put("Картофель", 25);
        recipe.put("Конфеты шоколадные", 465);
        recipe.put("Курица, бедро", 350);
        recipe.put("Томаты", 160);


        Recipe.createRecipe();

       }

}