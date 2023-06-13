import java.util.Scanner;
// Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
public class Ultimo {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];
        int suma = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }

            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }

            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);
        System.out.println("El promedio es: " + promedio);
    }
}
