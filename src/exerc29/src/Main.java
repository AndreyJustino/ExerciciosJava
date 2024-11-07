import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar?: ");
        int quant = sc.nextInt();
        double[] number = new double[quant];

        int count = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.print("Digite um numero: ");
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0){
                System.out.printf("%.1f ", number[i]);
                count++;
            }
        }

        System.out.printf("\nTotal de pares: %d%n", count);


        sc.close();


    }
}