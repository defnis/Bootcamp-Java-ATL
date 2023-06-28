import java.util.Scanner;

public class CalculadoraDeCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener la cantidad de dinero y el costo del producto
        System.out.print("Ingrese la cantidad de dinero: ");
        double cantidadDinero = scanner.nextDouble();

        System.out.print("Ingrese el costo del producto: ");
        double costoProducto = scanner.nextDouble();

        // Calcular el cambio
        double cambio = cantidadDinero - costoProducto;

        if (cambio < 0) {
            System.out.println("La cantidad de dinero es insuficiente.");
        } else {
            System.out.println("Cambio a entregar: " + cambio);

            // Calcular la cantidad de billetes y monedas necesarios
            int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
            int[] cantidadDenominaciones = new int[denominaciones.length];

            for (int i = 0; i < denominaciones.length; i++) {
                if (cambio >= denominaciones[i]) {
                    cantidadDenominaciones[i] = (int) (cambio / denominaciones[i]);
                    cambio %= denominaciones[i];
                }
            }

            // Mostrar la cantidad de billetes y monedas necesarios
            for (int i = 0; i < denominaciones.length; i++) {
                if (cantidadDenominaciones[i] > 0) {
                    if (denominaciones[i] >= 5) {
                        System.out.println(cantidadDenominaciones[i] + " billetes de $" + denominaciones[i]);
                    } else {
                        System.out.println(cantidadDenominaciones[i] + " monedas de $" + denominaciones[i]);
                    }
                }
            }
        }
    }
}
