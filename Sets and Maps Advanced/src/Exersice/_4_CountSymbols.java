package Exersice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> symbolMap = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!symbolMap.containsKey(currentChar)) {
                symbolMap.put(currentChar, 1);
            } else {
                int currentCharCount = symbolMap.get(currentChar);
                symbolMap.put(currentChar, ++currentCharCount);
            }
        }

        for (var pair : symbolMap.entrySet()) {
            System.out.printf("%s: %d time/s%n", pair.getKey(), pair.getValue());
        }

    }
}
