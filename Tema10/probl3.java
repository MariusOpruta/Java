import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class probl3 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\NJ\\Java\\Tema10\\cuvinte.txt");
        BufferedReader reader = Files.newBufferedReader(path);
        String linie = "0";
        int i = Integer.parseInt(linie);
        while( (linie = reader.readLine()) != null ) {
            if(!linie.isEmpty()) {
                i++;
            }
            System.out.println("Linia "+i+" are cuvantul "+linie+ " si are lungimea "+linie.length());
        }
    }
}

