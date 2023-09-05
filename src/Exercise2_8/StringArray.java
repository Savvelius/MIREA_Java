package Exercise2_8;

import Exercise1.Task3;
import Exercise2_5.Dog;

import java.util.ArrayList;
import java.util.Collections;

public class StringArray {
    public ArrayList<String> strings = new ArrayList<>();
    public void fillFromConsole() {
        while (true) {
            System.out.println("Enter new string (or EXIT to exit):");
            String string = System.console().readLine();
            if (string.equals("EXIT"))
                break;
            strings.add(string);
        }
    }
    @Override
    public String toString() {
        return "StringArray(strings = " + strings + ")\n";
    }
    public void reverse() {
        for (int i = 0; i < strings.size() / 2; ++i)
            Collections.swap(strings, i, strings.size() - 1 - i);
    }
    public static StringArray test() {
        StringArray arr = new StringArray();
        arr.fillFromConsole();
        System.out.println("Strings before reversal:");
        System.out.println(arr);
        arr.reverse();
        System.out.println("Strings after reversal:");
        System.out.println(arr);
        return arr;
    }
}
