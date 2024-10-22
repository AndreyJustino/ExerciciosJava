import java.util.Scanner;

public class exerc08 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int number = sc.nextInt();
		
		if(number < 0) {
			System.out.println("Este numero é negativo");
		} else {
			System.out.println("Este numero é positivo");
		}
		
		sc.close();

	}

}
