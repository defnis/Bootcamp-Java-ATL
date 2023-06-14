import java.util.Random;

public class Contrasenas {
    // Método para generar una contraseña aleatoria
    public static String generarContrasena(int longitud) {
        // Definimos los caracteres que se utilizarán para generar la contraseña
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+";
        StringBuilder contrasena = new StringBuilder();

        // Creamos un objeto Random para generar valores aleatorios
        Random random = new Random();

        // Generamos la contraseña de la longitud deseada
        for (int i = 0; i < longitud; i++) {
            // Obtenemos un índice aleatorio dentro del rango de caracteres
            int indice = random.nextInt(caracteres.length());

            // Agregamos el carácter correspondiente al índice a la contraseña
            contrasena.append(caracteres.charAt(indice));
        }

        // Devolvemos la contraseña generada como un String
        return contrasena.toString();
    }

    // Ejemplo de uso: generar una contraseña de longitud 8
    public static void main(String[] args) {
        int longitud = 8;
        String contrasenaGenerada = generarContrasena(longitud);
        System.out.println(contrasenaGenerada);
    }
}
