import java.util.Scanner;
import java.util.Locale;

public class exerc06 {

	public static void main(String[] args) {
		//  ler o código de uma peça 1
		//  o número de peças 1
		//  o valor unitário de cada peça 1
		//  o código de uma peça 2
		//  o número de peças 2
		//  valor unitário de cada peça 2
		
		int cod1, num1, cod2, num2;
		double value1, value2, calculo;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		value1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		value2 = sc.nextDouble();
		
		calculo = (value1 * num1) + (value2 * num2);
		
		System.out.println("VALOR A PAGAR: R$ " + calculo);
		
		sc.close();

	}

}
