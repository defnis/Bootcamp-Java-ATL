package CalculadoraPropinas;
import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el total de la cuenta en el restaurante: ");
        double totalCuenta = scanner.nextDouble();
        
        System.out.print("Ingrese el porcentaje de propina que desea dejar: ");
        double porcentajePropina = scanner.nextDouble();
        
        double propina = calcularPropina(totalCuenta, porcentajePropina);
        
        System.out.println("El monto de la propina es: " + propina);
    }
    
    public static double calcularPropina(double totalCuenta, double porcentajePropina) {
        double propina = totalCuenta * (porcentajePropina / 100);
        return propina;
    }
}
