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
