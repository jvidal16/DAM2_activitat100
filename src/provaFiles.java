import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class provaFiles {
    public static void main(String[] args) {

        try (BufferedReader br = Files.newBufferedReader(
                Paths.get("src/prova1.csv")))
        {
            String linea;

            while(br.ready()) {
                linea = br.readLine();
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("⚠ Error en llegir l'arxiu:" + e.getMessage());
        }
    }
}
