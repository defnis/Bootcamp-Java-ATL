import java.util.Scanner;
// Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
public class MayorMenor {
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

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }

            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);
    }
}
