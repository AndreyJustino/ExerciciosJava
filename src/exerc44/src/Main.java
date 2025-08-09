import entities.Installment;
import entities.Contracts;
import services.ContractService;
import services.Paypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato:");

        System.out.print("Numero: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        String date = sc.nextLine();

        System.out.print("Valor de contrato: ");
        double valueTotal = sc.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        int installment = sc.nextInt();

        sc.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Contracts contracts = new Contracts(
                number,
                LocalDate.parse(date, formatter),
                valueTotal
        );

        ContractService contractService = new ContractService(new Paypal());

        contractService.processContract(contracts,installment);

        System.out.println("Parcelas:");
        for (Installment values : contracts.getInstallmentList()){
            System.out.println(values.toString());
        }

    }
}
