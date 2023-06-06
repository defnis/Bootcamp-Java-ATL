package JuegoAdivinarNumero;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        
        Scanner scanner = new Scanner(System.in);
        
        int intentos = 0;
        int numeroAdivinado = -1;
        
        System.out.println("Bienvenido al juego de adivinar el número!");
        
        while (numeroAdivinado != numeroAleatorio) {
            System.out.print("Ingrese un número entre 1 y 100: ");
            numeroAdivinado = scanner.nextInt();
            
            intentos++;
            
            if (numeroAdivinado < numeroAleatorio) {
                System.out.println("El número a adivinar es mayor. ¡Sigue intentando!");
            } else if (numeroAdivinado > numeroAleatorio) {
                System.out.println("El número a adivinar es menor. ¡Sigue intentando!");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intento(s).");
            }
        }
    }
}

