import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas?: ");
        int number = sc.nextInt();

        double[] height = new double[number];
        char[] gender = new char[number];

        double max = 0;
        double min = 0;
        double average = 0;
        int contF = 0;
        int contM = 0;

        for (int i = 0; i < number; i++) {
            System.out.printf("Digite a altura da %d° pessoa: ", i + 1);
            height[i] = sc.nextDouble();

            System.out.printf("Digite o genero da %d° pessoa: ", i + 1);
            gender[i] = sc.next().toUpperCase().charAt(0);

            if (gender[i] == 'F'){
                contF++;
                average += height[i];
            }

            if (gender[i] == 'M'){
                contM++;
            }
        }

        max = height[0];
        min = height[0];

        for (int i = 0; i < height.length; i++) {
            if (height[i] > max){
                max = height[i];
            }

            if (height[i] < min){
                min = height[i];
            }
        }

        average = average / contF;

        System.out.printf("Menor altura: %.2f%n",min);
        System.out.printf("Maior altura: %.2f%n",max);

        System.out.printf("Altura media das mulher: %.2f%n",average);

        System.out.printf("Numero de homens: %d%n",contM);

        sc.close();
    }
}