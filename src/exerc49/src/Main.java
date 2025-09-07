import entity.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

//        ".\\src\\in.txt"
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        List<Employee> employeeList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();

            while (line != null){
                String[] vetor = line.split(",");
                employeeList.add(new Employee(vetor[0],vetor[1],Double.parseDouble(vetor[2])));

                line = bufferedReader.readLine();
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

        Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        System.out.println("Email of people whose salary is more than " + salary);
        employeeList.stream()
                .filter(employee -> employee.getSalary() > salary)
                .map(Employee::getEmail)
                .sorted(comparator)
                .forEach(System.out::println);

        double sum = employeeList.stream()
                .filter(employee -> employee.getName().toUpperCase().charAt(0) == 'M')
                .map(Employee::getSalary)
                .reduce(0.0, (x, y) -> x + y);

        System.out.println("Sum of salary of people whose name starts with 'M': " + sum);
    }
}