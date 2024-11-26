import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios? ");
        int quant = sc.nextInt();

        List<Funcionario> funcionariosList = new ArrayList<>();

        for (int i = 0; i < quant; i++) {
            System.out.printf("%d° Funcionario: %n",i + 1);

            System.out.print("ID: ");
            int id = sc.nextInt();

            for (Funcionario value : funcionariosList){
                if(value.getId() == id){
                    throw new Exception("Id ja cadastrado");
                }
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salario: ");
            float balance = sc.nextFloat();

            Funcionario funcionario = new Funcionario(id, name, balance);
            funcionariosList.add(funcionario);
        }

        System.out.print("ID do funcionario que vai ter aumento: ");
        int id = sc.nextInt();

        System.out.print("Porcentagem de aumento que esse funcionario vai receber: ");
        float percentage = sc.nextFloat();

        boolean result = false;

        for (Funcionario value: funcionariosList){
            if (value.getId() == id){

                result = true;

                break;
            }
        }

        if (result){
            for(Funcionario value : funcionariosList){

                if(value.getId() == id){
                    value.increase(percentage);
                }

            }
        }else{
            throw new Exception("ID não cadastrado!");
        }

        System.out.println("Lista de funcionarios: ");

        for(Funcionario value: funcionariosList){
            System.out.println(value.toString());
        }

        sc.close();
    }
}