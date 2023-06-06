package CalculadoraPropinas;
import java.util.Scanner;

public class ConversorMillasKilometros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una distancia en millas: ");
        double millas = scanner.nextDouble();
        
        double kilometros = convertirMillasAKilometros(millas);
        
        System.out.println("La distancia en kilómetros es: " + kilometros);
    }
    
    public static double convertirMillasAKilometros(double millas) {
        double kilometros = millas * 1.60934;
        return kilometros;
    }
}

