import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar?: ");
        int quant = sc.nextInt();

        double[] number = new double[quant];

        double sum = 0;
        double average = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.print("Digite um numero: ");
            number[i] = sc.nextDouble();

            sum += number[i];
        }

        average = sum / number.length;

        System.out.printf("Media do vetor = %.3f%n", average);

        System.out.println("Numeros abaixo da media.");
        for (int i = 0; i < number.length; i++) {
            if (number[i] < average){
                System.out.printf("%.1f%n", number[i]);
            }
        }

        sc.close();
    }
}