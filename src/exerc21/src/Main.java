import entity.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a base do retangulo: ");
        double width = sc.nextDouble();

        System.out.print("Informe a altura do retangulo: ");
        double height = sc.nextDouble();

        sc.close();

        Rectangle rectangle = new Rectangle();

        rectangle.width = width;
        rectangle.height = height;

        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
    }
}