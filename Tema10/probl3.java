import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class probl3 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\NJ\\Java\\Tema10\\fisier.txt");
        BufferedReader reader = Files.newBufferedReader(path);
        String linie ;

        while( (linie = reader.readLine()) != null ) {
            List<String> litere =new ArrayList<>();
            if (linie.contains(linie.toLowerCase())) {
                litere.add(linie);
            }
          System.out.println(litere);
        }
    }

}

