import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class probl1 {
    public static void main(String[] args) throws IOException {
        try {
            Path path = Paths.get("D:\\NJ\\Java\\Tema10\\cuvinte.txt");
            List<String> citire = Files.readAllLines(path);
            for(String i: citire){
                if (i.contains("a") || i.contains("A")){
                    System.out.println(i);
                }
            }
        } catch (IOException e) {
            System.out.println("Nu se gaseste fisierul!");
        }
    }
}

