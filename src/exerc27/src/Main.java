import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar?: ");
        int number = sc.nextInt();

        double[] listNumber = new double[number];
        double total = 0;

        for (int i = 0; i < listNumber.length; i++) {
            System.out.print("Digite um numero: ");
            listNumber[i] = sc.nextInt();

            total += listNumber[i];
        }

        System.out.print("Valores = ");

        for (int i = 0; i < listNumber.length; i++) {
            System.out.printf("%.2f ", listNumber[i]);
        }

        System.out.printf("\nTotal = %.2f%n", total);
        System.out.printf("Media = %.2f%n", total / listNumber.length);

        sc.close();
    }
}