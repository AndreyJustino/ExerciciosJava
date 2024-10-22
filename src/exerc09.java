import java.util.Scanner;

public class exerc09 {

	public static void main(String[] args) {
		// fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Este numero é par.");
		} else {
			System.out.println("Este numero é impar.");
		}
		
		sc.close();
	}

}
