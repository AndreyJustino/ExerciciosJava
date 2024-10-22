import java.util.Locale;
import java.util.Scanner;

public class exerc03 {
	
	public static void main(String[] args) {
		
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2.0);
		
		System.out.printf("Area desse circulo é: %.4f", area);
		
		sc.close();
	}

}
