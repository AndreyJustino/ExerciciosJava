import entities.Hospede;

import java.sql.Struct;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Hospede[] hospede = new Hospede[10];

        System.out.print("Quantos alunos?: ");
        int quant = sc.nextInt();

        if (quant > 10){
            System.out.print("A quantidade maxima é 10!");
        }else{
            for (int i = 0; i < quant; i++) {
                sc.nextLine();
                System.out.println("Inscrição #" + (i + 1) + ":");

                System.out.print("Nome: ");
                String name = sc.nextLine();

                System.out.print("Email: ");
                String email = sc.next();

                System.out.print("Quarto: ");
                int number = sc.nextInt();

                hospede[number] = new Hospede(name, email);

            }

            System.out.println("Quartos Ocupados:");

            for (int i = 0; i < hospede.length; i++) {

                if(hospede[i] != null){
                    System.out.printf("%d: %s%n" , i+1, hospede[i]);
                }

            }
        }

        sc.close();

    }
}