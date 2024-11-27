import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantas linhas: ");
        int lin = sc.nextInt();

        System.out.print("Informe quantas colunas: ");
        int col = sc.nextInt();

        System.out.println("");

        int[][] matriz = new int[lin][col];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Qual numero você quer a posição: ");
        int number = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == number){

                    System.out.println("Posição " + i + "," + j + ":");

                    if(j > 0){
                        System.out.printf("Valor a Esquerda: %d%n", matriz[i][j - 1]);
                    }

                    if (j < matriz[i].length - 1){
                        System.out.printf("Valor a Direita: %d%n", matriz[i][j + 1]);

                    }

                    if(i > 0){
                        System.out.printf("Valor a Acima: %d%n", matriz[i - 1][j]);
                    }

                    if(i < matriz.length){
                        System.out.printf("Valor a Abaixo: %d%n", matriz[i + 1][j]);
                    }

                    System.out.println("");
                }
            }
        }

        sc.close();
    }
}