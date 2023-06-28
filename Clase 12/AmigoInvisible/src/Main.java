import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los nombres de las personas.
        System.out.print("Ingrese la cantidad de participantes: ");
        int cantidadParticipantes = scanner.nextInt();
        scanner.nextLine();
        String[] participantes = new String[cantidadParticipantes];

        for (int i = 0; i < cantidadParticipantes; i++) {
            System.out.print("Participante " + (i + 1) + ", escriba su nombre y presione Enter: ");
            participantes[i] = scanner.nextLine();
        }
        System.out.print("Los participantes son: ");

        for (int i = 0; i < participantes.length; i++) {
            System.out.print(participantes[i]);

            if (i != participantes.length - 1) {
                System.out.print(", ");
            }
        }

        // Llama a cada participante y le asigna a quien debe preparar el regalo.
        Random random = new Random();
        for (int i = 0; i < cantidadParticipantes; i++) {
            System.out.println("\n\nEs el turno de: " + participantes[i]);
            System.out.print("Cuando esté listo para asignar un regalo, ingrese 'OK' y presione Enter: ");
            String confirmacion = scanner.nextLine();

            if (confirmacion.equalsIgnoreCase("OK")) {
                int indiceRegalado = random.nextInt(cantidadParticipantes);
                // Verificar que no se le asigne a sí mismo
                while (indiceRegalado == i) {
                    indiceRegalado = random.nextInt(cantidadParticipantes);
                }
                System.out.println(participantes[i] + " le regala a " + participantes[indiceRegalado]);
            } else {
                System.out.println("No se asignó un regalo en este turno.");
            }

            System.out.print("Presione Enter para limpiar la pantalla.");
            scanner.nextLine();

            // Limpiar la pantalla
            for (int j = 0; j < 15; j++) {
                System.out.println();
            }
        }

        // Escribir algo para limpiar la consola

        //Que venga la siguiente participante.


    }
}





