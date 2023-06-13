import java.util.Scanner;

public class LlamadaWhatsapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de teléfono (sin espacios): ");
        String telefono = scanner.nextLine();

        String url = "https://api.whatsapp.com/send?phone=" + telefono;
        System.out.println("URL de WhatsApp: " + url);
    }
}
