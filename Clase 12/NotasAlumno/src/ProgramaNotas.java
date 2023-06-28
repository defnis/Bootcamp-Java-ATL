import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alumno> alumnos = new ArrayList<>();

        System.out.print("¿Cuántos alumnos desea ingresar?: ");
        int cantidadAlumnos = scanner.nextInt();

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("\nAlumno #" + (i + 1));

            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.next();

            System.out.print("Ingrese el apellido del alumno: ");
            String apellido = scanner.next();

            Alumno alumno = new Alumno(nombre, apellido);

            System.out.print("¿Cuántas notas desea ingresar para el alumno " + nombre + " " + apellido + "?: ");
            int cantidadNotas = scanner.nextInt();

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.print("Ingrese la nota #" + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                alumno.agregarNota(nota);
            }

            alumnos.add(alumno);
        }

        System.out.println("\nResultados:");

        for (Alumno alumno : alumnos) {
            System.out.println("-------------------------------------");
            System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getApellido());
            System.out.println("Promedio de notas: " + alumno.calcularPromedio());
        }

        scanner.close();
    }
}

