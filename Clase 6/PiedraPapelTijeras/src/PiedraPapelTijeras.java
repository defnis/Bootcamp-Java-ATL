import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        String[] opciones = {"piedra", "papel", "tijeras"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Piedra, Papel, Tijeras!");

        while (true) {
            System.out.print("Ingrese su elección (piedra, papel o tijeras): ");
            String eleccionUsuario = scanner.nextLine().toLowerCase();

            // Verificar si la elección del usuario es válida
            if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijeras")) {
                System.out.println("Elección inválida. Por favor, ingrese piedra, papel o tijeras.");
                continue;
            }

            // Generar elección aleatoria para la computadora
            int indiceAleatorio = random.nextInt(opciones.length);
            String eleccionComputadora = opciones[indiceAleatorio];

            System.out.println("La computadora elige: " + eleccionComputadora);

            // Determinar el ganador
            if (eleccionUsuario.equals(eleccionComputadora)) {
                System.out.println("Empate!");
            } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijeras"))
                    || (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra"))
                    || (eleccionUsuario.equals("tijeras") && eleccionComputadora.equals("papel"))) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡Perdiste!");
            }

            // Preguntar al usuario si desea jugar nuevamente
            System.out.print("¿Desea jugar nuevamente? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();

            if (!respuesta.equals("s")) {
                break;
            }
        }

        System.out.println("Gracias por jugar. ¡Hasta luego!");
        scanner.close();
    }
}

