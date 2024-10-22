import java.util.Scanner;
import java.util.Locale;

public class exerc12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quant = sc.nextInt();
		
		
		switch (codigo) {
		case 1: {
			
			double calculo = quant * 4.0; 
			System.out.printf("O total a pagar pelos cachorro quente é R$ %.2f", calculo);
			
			break;
		}
		case 2: {
			
			double calculo = quant * 4.5; 
			System.out.printf("O total a pagar pelos X-Salada é R$ %.2f", calculo);
			
			break;
		}
		case 3: {
			
			double calculo = quant * 5.0; 
			System.out.printf("O total a pagar pelos X-Bacon é R$ %.2f", calculo);
			
			break;
		}
		case 4: {
			
			double calculo = quant * 2.0; 
			System.out.printf("O total a pagar pelos Torrada Simples é R$ %.2f", calculo);
			
			break;
		}
		case 5: {
			
			double calculo = quant * 1.5; 
			System.out.printf("O total a pagar pelos Refrigerante é R$ %.2f", calculo);
			
			break;
		}
		default:
			System.out.println("Codigo invalido.");
			break;
		}
		
		sc.close();
	}

}
