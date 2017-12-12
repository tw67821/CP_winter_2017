package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountingWords {

    static final String FILE_LOC = "C:\\words2.txt";

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }


    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Integer> myMap = new HashMap<>();

        File file = new File(FILE_LOC);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String myLine = scanner.nextLine();
            String[] elem = myLine.split(" ");

            for (String el : elem) {
                if (el.endsWith(".") || el.endsWith(",") || el.endsWith(":") || el.endsWith(";")) {
                    el = removeLastChar(el);
                }
                /*char first = el.charAt(0);
                char first1 = 0;
                if (Character.isUpperCase(first)){
                    first1 = first;
                    first += 32;
                    el.replace(first1, first);

                }*/

                if (myMap.containsKey(el)) {
                    myMap.put(el, myMap.get(el) + 1);
                } else {
                    myMap.put(el, 1);
                }
            }
        }
        for (String key : myMap.keySet()) {
            System.out.println("The word '" + key + "' occurs " + myMap.get(key) + " times.");
        }
    }
}

