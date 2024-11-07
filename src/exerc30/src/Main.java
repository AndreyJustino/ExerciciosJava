import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar?: ");
        int quant = sc.nextInt();

        double[] number = new double[quant];
        int index = 0;
        double max = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.print("Digite um numero: ");
            number[i] = sc.nextDouble();

            if (number[i] > max){
                max = number[i];
                index = i;
            }
        }

        System.out.printf("O maior numero é %.1f%n", max);
        System.out.printf("Sua posição é %d", index + 1);




        sc.close();
    }
}