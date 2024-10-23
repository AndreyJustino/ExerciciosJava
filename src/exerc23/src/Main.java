import entite.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String name = sc.nextLine();

        System.out.println("Informe as 3 notas do aluno: ");
        double grade1 = sc.nextDouble();
        double grade2 = sc.nextDouble();
        double grade3 = sc.nextDouble();

        sc.close();

        student.name = name;
        student.grade1 = grade1;
        student.grade2 = grade2;
        student.grade3 = grade3;

        student.calc();
    }
}