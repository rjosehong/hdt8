import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class leerArchivo {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("pacie.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}