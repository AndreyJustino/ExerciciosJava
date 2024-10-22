import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            float n1 = sc.nextFloat();
            float n2 = sc.nextFloat();
            float n3 = sc.nextFloat();

            float media = (n1 + n2 + n3) / 3;
            System.out.printf("A média é: %.1f %n", media);
        }

        sc.close();

    }
}