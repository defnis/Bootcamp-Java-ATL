public class CalcularArea {
    public static void main(String[] args) {
        int lado = 5; // Longitud del lado del cuadrado
        int area = calcularAreaCuadrado(lado);
        System.out.println("El área del cuadrado es: " + area);
    }

    public static int calcularAreaCuadrado(int lado) {
        int area = lado * lado;
        return area;
    }
}
