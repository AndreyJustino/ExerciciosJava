import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor?: ");
        int quant = sc.nextInt();

        double[] number = new double[quant];
        double sum = 0;
        int cont = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.print("Digite um numero: ");
            number[i] = sc.nextDouble();

            if (number[i] % 2 == 0){
                sum += number[i];
                cont++;
            }
        }

        double average = sum / cont;

        if (average > 0){
            System.out.printf("Media dos pares = %.1f%n", average);
        }else{
            System.out.print("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}