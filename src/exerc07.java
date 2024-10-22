import java.util.Scanner;
import java.util.Locale;

public class exerc07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double triangulo = A * C / 2.0;
		double circulo = 3.14159 * Math.pow(C, 2.0);
		double trapezio = (A + B) * C / 2.0;
		double quadrado = Math.pow(B, 2.0);
		double retangulo = A * B;
		
		System.out.printf("triangulo: %.2f %n" , triangulo);
		System.out.printf("circulo: %.2f %n" , circulo);
		System.out.printf("trapezio: %.2f %n" , trapezio);
		System.out.printf("quadrado: %.2f %n" , quadrado);
		System.out.printf("retangulo: %.2f %n" , retangulo);
		
		sc.close();
	}

}
