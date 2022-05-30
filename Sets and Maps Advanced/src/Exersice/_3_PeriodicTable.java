package Exersice;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCompounds = Integer.parseInt(scanner.nextLine());
        Set<String> treeSet = new TreeSet<>();

        for (int i = 0; i < numberOfCompounds; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Collections.addAll(treeSet, data);

        }
        String result = String.join(" ", treeSet);
        System.out.println(result);

    }
}
