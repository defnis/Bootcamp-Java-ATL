import java.util.Scanner;

        /* Crear un juego de adivinar la palabra: Este juego consiste en mostrar una pista o descripción y permitir
        al jugador adivinar la palabra correcta. Por ejemplo, el programa podría mostrar el mensaje:
        "Es un animal muy grande, con trompa. ¿Qué es?" El jugador debe ingresar su respuesta y el programa debe
        verificar si es correcta o no. */

public class JuegoAdivinarPalabra {
    public static void main(String[] args) {
        String palabraSecreta = "elefante";
        String pista = "Es un animal muy grande, con trompa. ¿Qué es?";

        System.out.println(pista);

        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase(palabraSecreta)) {
            System.out.println("¡Correcto! ¡Adivinaste la palabra!");
        } else {
            System.out.println("Respuesta incorrecta. La palabra correcta era: " + palabraSecreta);
        }

        scanner.close();
    }
}
