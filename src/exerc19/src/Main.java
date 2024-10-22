import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite até que numero que ver os impares:");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {
            if(i % 2 != 0){
                System.out.printf("%d %n",i);
            }
        }

        sc.close();
    }
}