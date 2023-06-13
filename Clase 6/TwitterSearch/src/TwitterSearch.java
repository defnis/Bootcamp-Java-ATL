import java.util.Scanner;

public class TwitterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre de una celebridad: ");
        String palabra = scanner.nextLine();

        String url = "https://twitter.com/search?q=" + palabra;
        System.out.println("URL de búsqueda: " + url);
    }
}
