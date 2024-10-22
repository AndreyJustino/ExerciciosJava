import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float x,y;
        System.out.println("Digite as coordenadas:");
        x = sc.nextFloat();
        y = sc.nextFloat();

        while (x != 0 && y != 0){

            if(x < 0 && y > 0){
                System.out.println("Primeiro");
            } else if(x < 0 && y < 0){
                System.out.println("Segundo");
            } else if (x > 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y > 0) {
                System.out.println("Quarto");
            }

            System.out.println("Digite as coordenadas:");
            x = sc.nextFloat();
            y = sc.nextFloat();

        }

        sc.close();
    }
}