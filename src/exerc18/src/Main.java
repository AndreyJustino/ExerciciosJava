import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = 0;
        int alcool = 1;
        int gasolina = 2;
        int diesel = 0;

        while (codigo != 4){

            System.out.println("Digite o codigo do tipo de combustivel:");
            codigo = sc.nextInt();

            if(codigo == 1){

                System.out.printf("Alcool: %d %n", alcool);
                alcool++;

            } else if (codigo == 2) {

                System.out.printf("Gasolina: %d %n", gasolina);
                gasolina++;

            } else if (codigo == 3) {
                System.out.printf("Diesel: %d %n", diesel);
                diesel++;
            }

        }
        System.out.println("MUITO OBRIGADO");

        sc.close();
    }
}