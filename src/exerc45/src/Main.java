import entities.LogUser;

import java.io.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //".\\src\\in.txt"
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        Set<LogUser> setLogsUser = new HashSet<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();

            while(line != null){
                String[] columns = line.split(" ");

                setLogsUser.add(new LogUser(columns[0], Instant.parse(columns[1])));

                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.printf("Total users: %d", setLogsUser.size());

            sc.close();
        }
    }
}