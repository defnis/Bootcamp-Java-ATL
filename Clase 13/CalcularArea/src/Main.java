
        /* Crea una clase base llamada "Figura" con métodos para calcular el área y el perímetro de una
        figura geométrica genérica. Luego, crea clases derivadas como "Triangulo", "Rectangulo" y
        "Circulo", que hereden de la clase base y sobreescriban los métodos para calcular el área y el
        perímetro según su forma específica. Crea instancias de las diferentes figuras y muestra sus
        áreas y perímetros.*/

        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                boolean salir = false;

                while (!salir) {
                    System.out.println("¿Qué área desea calcular?");
                    System.out.println("1. Círculo");
                    System.out.println("2. Cuadrado");
                    System.out.println("3. Triángulo");
                    System.out.println("4. Rectángulo");
                    System.out.println("0. Salir");
                    System.out.print("Ingrese el número de opción: ");
                    int opcion = scanner.nextInt();

                    Figura figura = null;
                    double area = 0;
                    double perimetro = 0;

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese el radio del círculo: ");
                            double radioCirculo = scanner.nextDouble();
                            figura = new Circulo(radioCirculo);
                            area = figura.calcularArea();
                            perimetro = figura.calcularPerimetro();
                            break;
                        case 2:
                            System.out.print("Ingrese el lado del cuadrado: ");
                            double ladoCuadrado = scanner.nextDouble();
                            figura = new Cuadrado(ladoCuadrado);
                            area = figura.calcularArea();
                            perimetro = figura.calcularPerimetro();
                            break;
                        case 3:
                            System.out.print("Ingrese la base del triángulo: ");
                            double baseTriangulo = scanner.nextDouble();
                            System.out.print("Ingrese la altura del triángulo: ");
                            double alturaTriangulo = scanner.nextDouble();
                            System.out.print("Ingrese el lado 1 del triángulo: ");
                            double lado1Triangulo = scanner.nextDouble();
                            System.out.print("Ingrese el lado 2 del triángulo: ");
                            double lado2Triangulo = scanner.nextDouble();
                            System.out.print("Ingrese el lado 3 del triángulo: ");
                            double lado3Triangulo = scanner.nextDouble();
                            figura = new Triangulo(baseTriangulo, alturaTriangulo, lado1Triangulo, lado2Triangulo, lado3Triangulo);
                            area = figura.calcularArea();
                            perimetro = figura.calcularPerimetro();
                            break;
                        case 4:
                            System.out.print("Ingrese la base del rectángulo: ");
                            double baseRectangulo = scanner.nextDouble();
                            System.out.print("Ingrese la altura del rectángulo: ");
                            double alturaRectangulo = scanner.nextDouble();
                            figura = new Rectangulo(baseRectangulo, alturaRectangulo);
                            area = figura.calcularArea();
                            perimetro = figura.calcularPerimetro();
                            break;
                        case 0:
                            salir = true;
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                            break;
                    }

                    if (!salir) {
                        System.out.println("El área de la figura seleccionada es: " + area);
                        System.out.println("El perímetro de la figura seleccionada es: " + perimetro);
                        System.out.println();
                    }
                }

                scanner.close();
                System.out.println("¡Hasta luego!");
            }
        }
