import util.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero da conta: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o nome do titular da conta: ");
        String name = sc.nextLine();

        System.out.print("Deseja fazer um deposito inicial? [S/N] ");
        char answer = sc.next().toUpperCase().charAt(0);

        Account account;

        if (answer == 'S'){
            System.out.print("Informe o valor do deposito inicial: ");
            double value = sc.nextDouble();

            account = new Account(numberAccount, name, value);
        } else{
            account = new Account(numberAccount, name);
        }

        System.out.println(account);

        System.out.print("Digite um valor para depositar: ");
        double valueDeposit = sc.nextDouble();

        account.deposit(valueDeposit);
        System.out.println(account);

        System.out.print("Digite um valor para sacar: ");
        double valueWithdraw = sc.nextDouble();

        account.withdraw(valueWithdraw);
        System.out.println(account);

        sc.close();
    }
}