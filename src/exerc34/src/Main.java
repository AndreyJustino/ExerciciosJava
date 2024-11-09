import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar?: ");
        int number = sc.nextInt();

        String[] names = new String[number];
        int[] ages = new int[number];
        int max = 0;
        int index = 0;


        for (int i = 0; i < number; i++) {
            System.out.printf("Dados da %d° pessoa %n", i + 1);
            sc.nextLine();

            System.out.print("Nome: ");
            names[i] = sc.nextLine();

            System.out.print("Idade: ");
            ages[i] = sc.nextInt();

            if (ages[i] > max){
                max = ages[i];
                index = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s", names[index]);

        sc.close();
    }
}