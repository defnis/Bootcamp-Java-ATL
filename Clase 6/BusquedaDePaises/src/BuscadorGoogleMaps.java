
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

    public class BuscadorGoogleMaps {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa un país: ");
            String pais = scanner.nextLine();

            String url = "https://www.google.com/maps/search/" + pais;

            System.out.println("URL del mapa: " + url);

            // Abrir el enlace en el navegador web predeterminado
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

