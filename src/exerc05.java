import java.util.Locale;
import java.util.Scanner;

public class exerc05 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		
		int numberFun, time;
		double valueTime, salary;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		numberFun = sc.nextInt();
		time = sc.nextInt();
		valueTime = sc.nextDouble();
		
		salary = time * valueTime;
		
		System.out.println("NUMBER: " + numberFun);
		System.out.println("SALARY: U$ " + salary);
		
		sc.close();

	}

}
