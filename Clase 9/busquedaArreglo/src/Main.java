import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personas = {"Lucas Moy", "Jose Waiman", "David Waiman"};

        System.out.println("Ingrese su busqueda: ");
        String busqueda = scanner.nextLine();

        String resultado = buscarPersona(busqueda, personas);

        if(resultado.isEmpty()){
            System.out.println("Lo siento, No se ha encontrado el registro que buscas.");
        }else{
            System.out.println("La persona "+resultado+" se encuentra registrada.");
        }
    }

    public static String buscarPersona(String busqueda, String[] arrPersonas){
        String respuesta = "";

        //Usando foreach
        for (String persona : arrPersonas) {
            if (persona.toUpperCase().contains(busqueda.toUpperCase())) respuesta = persona;
        }

        return respuesta;
    }
}
