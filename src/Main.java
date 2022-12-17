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

      Product.info();
    }
}