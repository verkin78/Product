import mathematics.MultiplicationTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(12);
        numbers.add(15);
        numbers.add(16);
        numbers.add(19);
        numbers.add(22);
        numbers.add(31);
        numbers.add(34);
        numbers.add(44);
        numbers.add(45);
        numbers.add(48);
        numbers.add(53);
        numbers.add(65);
        numbers.add(71);
        numbers.add(75);
        numbers.add(81);
        numbers.add(87);
        numbers.add(98);


        for (int i = 0; i < numbers.size(); i++) {
            Integer x = numbers.get(i);
            if (x % 2 != 0) {
                numbers.remove(x);
            }
        }
        System.out.println(numbers);
        MultiplicationTable.countMathTable();

        /*Product banana = new Product("Бфнан", "59 руб.", "1 кг");
        Product pineapple = new Product("Ананас", "138 руб.", "1 кг");
        Product apple = new Product("Яблоко", "72 руб.", "1 кг");
        Product egg = new Product("Яйцо куриное", "68 руб.", "1 кг");
        Product biff = new Product("Говядина, вырезка", "570 руб.", "1 кг");
        Product sausage = new Product("Сосиски свиные", "354 руб.", "1 кг");
        Product cheese = new Product("Сыр", "553 руб.", "1 кг");
        Product cookies = new Product("Печенье", "187 руб.", "1 кг");
        Product butter = new Product("Масло сливочное", "400 руб.", "1 кг");
        Product bread = new Product("Холеб", "118 руб.", "1 кг");
        Product carrot = new Product("Морковь", "43 руб.", "1 кг");
        Product potato = new Product("Картофель", "25 руб.", "1 кг");
        Product candy = new Product("Конфеты шоколадные", "465 руб.", "1 кг");
        Product chicken = new Product("Курица, бедро", "350 руб.", "1 кг");
        Product tomato = new Product("Томаты", "160 руб.", "1 кг");

        Set<Product> products = new HashSet<>();
        products.add(apple);
        products.add(banana);
        products.add(biff);
        products.add(bread);
        products.add(butter);
        products.add(candy);
        products.add(carrot);
        products.add(cheese);
        products.add(chicken);
        products.add(cookies);
        products.add(egg);
        products.add(pineapple);
        products.add(potato);
        products.add(sausage);
        products.add(tomato);

        System.out.println(products);

        Set<Recipe> recipes = new HashSet<>();
        Recipe chicken1 = new Recipe("", "", cheese, cheese, potato, egg, pineapple);
        System.out.println(chicken1);*/
    }
}