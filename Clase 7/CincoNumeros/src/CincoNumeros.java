import java.util.Scanner;
// Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
public class CincoNumeros {
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
    }
}
