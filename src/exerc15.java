import java.util.Locale;
import java.util.Scanner;

public class exerc15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		double salario = sc.nextDouble();
		
		if(salario <= 2000.00) {
			
			System.out.println("Isento");
			
		} else{
			
			 if (salario <= 3000.00) {
				
				double imposto = (salario - 2000.00) * 0.08;
				System.out.printf("O seu imposto é %.2f", imposto);
				
			} else if(salario <= 4500.00) {
				
				double imposto = (salario - 3000.00) * 0.18 + 1000 * 0.08;
				System.out.printf("O seu imposto é %.2f", imposto);
				
			} else {
				double imposto = (salario - 4500.00) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
				System.out.printf("O seu imposto é %.2f", imposto);
			}
		}
		
		sc.close();

	}

}
