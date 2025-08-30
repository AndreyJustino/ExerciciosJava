import entities.Produto;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = ".\\src\\produtos.csv";

        List<Produto> produtoList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();

            while (line != null){
                List<String> listLine;

                listLine = List.of(line.split(","));

                produtoList.add(new Produto(listLine.get(0),
                        Double.parseDouble(listLine.get(1)),
                        Integer.parseInt(listLine.get(2))));

                line = bufferedReader.readLine();
            }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        String outPath = ".\\src\\out\\produtosNew.csv";
        File file = new File(outPath);

        boolean sucess = file.getParentFile().mkdir();

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPath))){

            for (Produto produto : produtoList){
                bufferedWriter.write(produto.toString());
                bufferedWriter.newLine();
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}