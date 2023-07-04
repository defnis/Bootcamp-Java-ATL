
        /* Crea una clase base llamada "Personaje" con atributos como nombre, nivel y puntos de vida.
        Implementa métodos para que el personaje pueda atacar, recibir daño y curarse. Luego, crea
        clases derivadas como "Guerrero", "Mago" y "Arquero", que hereden de la clase base y añadan
        atributos y métodos específicos para cada tipo de personaje. Por ejemplo, la clase "Guerrero"
        podría tener un atributo adicional para la fuerza de ataque, mientras que la clase "Mago" podría
        tener un método para lanzar hechizos. Crea instancias de los diferentes personajes y simula un
        combate entre ellos. */

        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("¡Bienvenido al juego de combate!");
                System.out.println("Elige tu personaje: (1) Guerrero, (2) Mago, (3) Arquero");
                int opcionPersonaje = scanner.nextInt();

                Personaje personajeJugador;
                switch (opcionPersonaje) {
                    case 1:
                        personajeJugador = new Guerrero("Jugador", 1, 100, 30);
                        break;
                    case 2:
                        personajeJugador = new Mago("Jugador", 1, 80, 50);
                        break;
                    case 3:
                        personajeJugador = new Arquero("Jugador", 1, 90, 40);
                        break;
                    default:
                        System.out.println("Opción inválida. Seleccionando Guerrero por defecto.");
                        personajeJugador = new Guerrero("Jugador", 1, 100, 30);
                        break;
                }

                scanner.nextLine(); // Limpiar el búfer del escáner

                System.out.println("Elige el nombre del enemigo:");
                String nombreEnemigo = scanner.nextLine();

                System.out.println("Elige el nivel del enemigo:");
                int nivelEnemigo = scanner.nextInt();

                Personaje enemigo = new Guerrero(nombreEnemigo, nivelEnemigo, 100, 25);

                while (personajeJugador.getPuntosVida() > 0 && enemigo.getPuntosVida() > 0) {
                    System.out.println("¿Qué acción deseas realizar?");
                    System.out.println("(1) Atacar, (2) Curar");
                    int opcionAccion = scanner.nextInt();

                    if (opcionAccion == 1) {
                        System.out.println("Elige a quién deseas atacar: (1) Enemigo, (2) Jugador");
                        int opcionAtaque = scanner.nextInt();

                        Personaje objetivo;
                        switch (opcionAtaque) {
                            case 1:
                                objetivo = enemigo;
                                break;
                            case 2:
                                objetivo = personajeJugador;
                                break;
                            default:
                                System.out.println("Opción inválida. Atacando al enemigo por defecto.");
                                objetivo = enemigo;
                                break;
                        }

                        System.out.println("Ingresa el valor de daño:");
                        int danio = scanner.nextInt();

                        personajeJugador.atacar(objetivo, danio);
                    } else if (opcionAccion == 2) {
                        System.out.println("Elige a quién deseas curar: (1) Jugador, (2) Enemigo");
                        int opcionCura = scanner.nextInt();

                        Personaje objetivo;
                        switch (opcionCura) {
                            case 1:
                                objetivo = personajeJugador;
                                break;
                            case 2:
                                objetivo = enemigo;
                                break;
                            default:
                                System.out.println("Opción inválida. Curando al jugador por defecto.");
                                objetivo = personajeJugador;
                                break;
                        }

                        System.out.println("Ingresa la cantidad de puntos de curación:");
                        int puntosCura = scanner.nextInt();

                        personajeJugador.curar(puntosCura);
                    }

                    System.out.println("---------------------------");

                    if (personajeJugador.getPuntosVida() <= 0) {
                        System.out.println("¡Has sido derrotado! El enemigo ha ganado.");
                    } else if (enemigo.getPuntosVida() <= 0) {
                        System.out.println("¡Has derrotado al enemigo! ¡Eres el ganador!");
                    }
                }
            }
        }




