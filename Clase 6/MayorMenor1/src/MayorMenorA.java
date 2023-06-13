import java.util.Scanner;

public class MayorMenorA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        int mayor = Math.max(Math.max(numero1, numero2), numero3);
        int menor = Math.min(Math.min(numero1, numero2), numero3);

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}
