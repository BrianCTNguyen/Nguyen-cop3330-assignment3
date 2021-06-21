package oop.assignment3.ex41.base;

import java.util.*;

public class NameSorter {
    public static void readNames(Scanner input, ArrayList<String> names) {

        // reading the data till the file has nextLine

        while (input.hasNextLine()) {

            names.add(input.nextLine());
        }

        // function to sort names alphabetically

        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
    }
}
