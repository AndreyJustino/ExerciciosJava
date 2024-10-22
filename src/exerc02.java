import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, soma;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.printf("SOMA = %d", soma);
		
		sc.close();
	}

}
