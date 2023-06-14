public class Triangulo {
    public static void main(String[] args) {
        double base = 10.0; // Base del triángulo
        double altura = 5.0; // Altura del triángulo

        double area = calcularAreaTriangulo(base, altura);
        System.out.println("El área del triángulo es: " + area);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2.0;
        return area;
    }
}
