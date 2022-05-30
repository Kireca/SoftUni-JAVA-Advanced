package Exersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _6_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Map<String, String> emailKeeper = new LinkedHashMap<>();


        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (!email.contains(".us") && !email.contains(".uk") && !email.contains(".com")) {

                emailKeeper.put(name, email);
            }
            name = scanner.nextLine();
        }
        for (var personAndEmail : emailKeeper.entrySet()) {
            System.out.printf("%s -> %s%n", personAndEmail.getKey(), personAndEmail.getValue());
        }

    }
}
