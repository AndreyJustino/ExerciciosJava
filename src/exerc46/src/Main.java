import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        String[] array = {"A","B","C"};

        for (String value : array){
            System.out.printf("How many students for course %s? ", value);
            int amount = sc.nextInt();

            for (int i = 0; i < amount; i++) {
                System.out.printf("Which is the %d° student's code? ", i+1);
                set.add(sc.nextInt());
            }
        }

        System.out.printf("Total students: %d", set.size());

        sc.close();
    }
}