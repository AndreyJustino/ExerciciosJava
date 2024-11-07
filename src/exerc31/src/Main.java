import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar?: ");
        int quant  = sc.nextInt();

        int[] vetorA = new int[quant];
        int[] vetorB = new int[quant];
        int[] soma = new int[quant];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite um numero: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite um numero: ");
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < soma.length; i++) {
            soma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE");
        for (int i = 0; i < soma.length; i++) {
            System.out.printf("%d%n", soma[i]);
        }

        sc.close();

    }
}