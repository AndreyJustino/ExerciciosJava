import entities.Employee;
import entities.Outsourcedemployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Enter the number of employees: ");
        int numberEmployees = sc.nextInt();

        for (int i = 0; i < numberEmployees; i++) {
            System.out.printf("Employee #%d data: \n", i+1);

            sc.nextLine();

            System.out.print("Outsourced (y/n) ");
            char option = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valueHours = sc.nextDouble();

            if (String.valueOf(option).toLowerCase().equals("y")){
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();

                employeeList.add(new Outsourcedemployee(name, hours, valueHours, additional));
            }else {
                Employee employee = new Employee(name, hours, valueHours);

                employeeList.add(employee);
            }
        }

        sc.close();

        System.out.println("PAYMENTS:");

        for (Employee value : employeeList) {
            System.out.printf("%s - $ %.2f \n", value.getName(), value.payment());
        }
    }
}