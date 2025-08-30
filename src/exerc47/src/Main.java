import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //".\\src\\in.txt";
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();

            while (line != null){
                String[] fields = line.split(",");

                if (map.containsKey(fields[0])){
                    map.put(fields[0], map.get(fields[0]) + Integer.parseInt(fields[1]));
                }else {
                    map.put(fields[0], Integer.parseInt(fields[1]));
                }

                line = bufferedReader.readLine();
            }

        }catch (IOException e){

            System.out.println("Error: " + e.getMessage());

        }

        sc.close();

        for (String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
}