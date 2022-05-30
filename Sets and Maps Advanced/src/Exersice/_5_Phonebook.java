package Exersice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")) {

            String[] inputTokens = input.split("-");
            String name = inputTokens[0];
            String number = inputTokens[1];

            phoneBook.put(name, number);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("stop")) {

            if (phoneBook.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phoneBook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scanner.nextLine();
        }


    }
}
