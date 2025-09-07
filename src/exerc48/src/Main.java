import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

//        ".\\src\\in.csv"
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        List<Product> productList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();

            while (line != null){
                String[] vetor = line.split(",");

                productList.add(new Product(vetor[0], Double.parseDouble(vetor[1])));

                line = bufferedReader.readLine();
            }

        }catch (IOException e){

            System.out.println("Error: " + e.getMessage());

        }

        sc.close();

        double avg = productList.stream()
                .map(product -> product.getPrice())
                .reduce(0.0, (x, y) -> x + y) / productList.size();

        System.out.printf("Average price: %.2f \n", avg);

        Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        List<String> stringList = productList.stream()
                .filter(p -> p.getPrice() < avg)
                .map(product -> product.getName())
                .sorted(comparator.reversed())
                .toList();

        stringList.forEach(System.out::println);
    }
}