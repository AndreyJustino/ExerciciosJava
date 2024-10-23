import java.util.Locale;
import java.util.Scanner;
import entite.Employee;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Gross Salary: ");
        double grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee();

        employee.name = name;
        employee.grossSalary = grossSalary;
        employee.tax = tax;

        System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);



        sc.close();
    }
}