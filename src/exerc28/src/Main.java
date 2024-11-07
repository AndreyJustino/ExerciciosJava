import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas?: ");
        int number = sc.nextInt();

        String[] names = new String[number];
        double[] height = new double[number];
        int[] ages = new int[number];

        double sum = 0;
        int count = 0;


        for (int i = 0; i < number; i++) {
            sc.nextLine();

            System.out.printf("Dados da %d ° pessoa%n", i + 1);

            System.out.print("Nome: ");
            names[i] = sc.nextLine();


            System.out.print("Idade: ");
            ages[i] = sc.nextInt();

            System.out.print("Altura: ");
            height[i] = sc.nextDouble();

            sum += height[i];

            if (ages[i] < 16){
                count += 1;
            }
        }

        double average = sum / number;
        double percentage = ((double) count / number) * 100;

        System.out.printf("Altura media: %.2f%n", average);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentage);

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 16){
                System.out.printf("%s%n",names[i]);
            }
        }

        sc.close();

    }
}