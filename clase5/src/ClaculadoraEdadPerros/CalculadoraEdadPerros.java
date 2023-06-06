package ClaculadoraEdadPerros;
import java.util.Scanner;

public class CalculadoraEdadPerros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la edad de su perro en años humanos: ");
        int edadHumana = scanner.nextInt();
        
        int edadPerro = calcularEdadPerro(edadHumana);
        
        System.out.println("La edad de su perro en años de perro es: " + edadPerro);
    }
    
    public static int calcularEdadPerro(int edadHumana) {
        int edadPerro = 0;
        
        if (edadHumana > 0) {
            if (edadHumana <= 2) {
                // Los primeros dos años de un perro equivalen a 10.5 años de perro cada uno
                edadPerro = edadHumana * 10;
            } else {
                // Cada año adicional después de los dos primeros equivale a 4 años de perro
                edadPerro = 20 + ((edadHumana - 2) * 4);
            }
        }
        
        return edadPerro;
    }
}

