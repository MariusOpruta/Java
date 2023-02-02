import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class probl4 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("D:\\NJ\\Java\\Tema10\\cuvinte.txt");
            BufferedReader cuvinte = Files.newBufferedReader(path);
            String linie;
             while( (linie = cuvinte.readLine()) != null) {
                    System.out.println(linie.toLowerCase());
                }
        } catch (IOException e) {
            System.out.println("Nu se gaseste fisierul!");
        }

    }
}
