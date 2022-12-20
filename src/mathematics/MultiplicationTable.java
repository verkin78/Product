package mathematics;

import javax.swing.*;
import java.util.*;

public class MultiplicationTable {

    public static void countMathTable() {

        ArrayList<StringBuilder> tables = new ArrayList<>();
        tables.add(new StringBuilder("2 * 3"));
        tables.add(new StringBuilder("2 * 4"));
        tables.add(new StringBuilder("2 * 5"));
        tables.add(new StringBuilder("2 * 6"));
        tables.add(new StringBuilder("2 * 7"));
        tables.add(new StringBuilder("2 * 8"));
        tables.add(new StringBuilder("2 * 9"));
        tables.add(new StringBuilder("3 * 3"));
        tables.add(new StringBuilder("3 * 4"));
        tables.add(new StringBuilder("3 * 8"));
        tables.add(new StringBuilder("3 * 9"));
        tables.add(new StringBuilder("4 * 4"));
        tables.add(new StringBuilder("4 * 9"));
        tables.add(new StringBuilder("5 * 3"));
        tables.add(new StringBuilder("5 * 4"));
        tables.add(new StringBuilder("6 * 3"));
        tables.add(new StringBuilder("6 * 4"));
        tables.add(new StringBuilder("6 * 5"));
        tables.add(new StringBuilder("6 * 6"));
        tables.add(new StringBuilder("7 * 3"));
        tables.add(new StringBuilder("7 * 4"));
        tables.add(new StringBuilder("7 * 5"));
        tables.add(new StringBuilder("7 * 6"));
        tables.add(new StringBuilder("7 * 7"));
        tables.add(new StringBuilder("7 * 8"));
        tables.add(new StringBuilder("7 * 9"));
        tables.add(new StringBuilder("8 * 4"));
        tables.add(new StringBuilder("8 * 6"));
        tables.add(new StringBuilder("8 * 8"));
        tables.add(new StringBuilder("8 * 9"));
        tables.add(new StringBuilder("9 * 9"));
        Collections.shuffle(tables);
        JOptionPane.showMessageDialog(null,"Таблица умножения: ");
        for (int i = 1; i < 16; i++) {
            tables.remove(tables.get(i).reverse());
            JOptionPane.showMessageDialog(null,"Ученик"+i+" - "+tables.get(i));
        }
    }
}

   /* ArrayList<Integer> numbers = new ArrayList<>();

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
        MultiplicationTable.countMathTable();*/
