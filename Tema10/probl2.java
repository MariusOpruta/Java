import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class probl2 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\NJ\\Java\\Tema10\\numere.txt");
        List<String> numere = Files.readAllLines(path);
        int sum = Integer.parseInt(numere.get(0))+Integer.parseInt(numere.get(1));
        System.out.println("Suma numerelor este " + sum);

    }
}
