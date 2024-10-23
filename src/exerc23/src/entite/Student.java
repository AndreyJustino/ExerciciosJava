package entite;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public void calc(){
        double total = grade1 + grade2 + grade3;

        if (total >= 60) {
            System.out.printf("Final grade = %.2f%n", total);
            System.out.println("PASS");
        } else{
            System.out.printf("Final grade = %.2f%n", total);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINT", 60-total);
        }
    }
}
