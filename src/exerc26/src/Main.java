import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar?: ");
        int number = sc.nextInt();

        if (number <= 10){
            int[] listNumber = new int[number];

            for (int i = 0; i < listNumber.length; i++) {
                System.out.print("Digite um numero: ");
                listNumber[i] = sc.nextInt();
            }

            System.out.println("Numeros negativos");
            for (int i = 0; i < listNumber.length; i++) {
                if (listNumber[i] < 0){
                    System.out.printf("%d%n", listNumber[i]);
                }
            }
        }else{
            System.out.print("Maximo é 10 numeros");
        }

        sc.close();
    }
}