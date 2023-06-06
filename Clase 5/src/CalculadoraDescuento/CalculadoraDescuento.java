package CalculadoraDescuento;
import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = scanner.nextDouble();
        
        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();
        
        double precioFinal = calcularPrecioFinal(precioOriginal, descuento);
        
        System.out.println("El precio final después de aplicar el descuento es: " + precioFinal);
    }
    
    public static double calcularPrecioFinal(double precioOriginal, double descuento) {
        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        return precioFinal;
    }
}

