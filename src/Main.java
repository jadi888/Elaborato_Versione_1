import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inizializza una lista vuota di credenziali registrate
        List<String> credenzialiRegistrati;
        try {
            credenzialiRegistrati = Files.readAllLines(Paths.get("credenziali.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        MenuConfiguratore menuConfiguratore = new MenuConfiguratore(credenzialiRegistrati);
        menuConfiguratore.avviaMenu();
        menuConfiguratore.chiudiScanner();
    }
}