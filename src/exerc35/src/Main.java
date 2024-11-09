import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int number = sc.nextInt();

        String[] names = new String[number];
        double gradesFirst = 0;
        double gradesSecond = 0;
        double[] average = new double[number];

        for (int i = 0; i < number; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %d° aluno:%n", i + 1);

            System.out.print("Nome: ");
            names[i] = sc.nextLine();

            System.out.print("Nota 1° semestre: ");
            gradesFirst = sc.nextDouble();

            System.out.print("Nota 2° semestre: ");
            gradesSecond = sc.nextDouble();

            average[i] = (gradesFirst + gradesSecond) / 2;
        }

        System.out.println("\nAlunos aprovados: ");

        for (int i = 0; i < average.length; i++) {
            if (average[i] >= 6){
                System.out.printf("%s%n",names[i]);
            }

        }

        sc.close();
    }
}