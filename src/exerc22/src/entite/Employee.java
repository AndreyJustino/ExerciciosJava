package entite;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        double perc = (this.grossSalary * percentage) / 100;
        double calc = netSalary() + perc;

        System.out.printf("Updated data: %s, $ %.2f", name, calc);
    }
}
