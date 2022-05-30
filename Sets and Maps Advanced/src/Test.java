import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);
        System.out.println();
        set.clear();
    }
}
