public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;

    // Constructor
    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    // Métodos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    // Método para atacar a otro personaje
    public void atacar(Personaje objetivo, int puntosAtaque) {
        System.out.println(nombre + " ataca a " + objetivo.getNombre() + "!");
        objetivo.recibirDanio(puntosAtaque);
    }

    // Método para recibir daño
    public void recibirDanio(int puntosDanio) {
        puntosVida -= puntosDanio;
        if (puntosVida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        } else {
            System.out.println(nombre + " ha recibido " + puntosDanio + " puntos de daño.");
        }
    }

    // Método para curar al personaje
    public void curar(int puntosCura) {
        puntosVida += puntosCura;
        System.out.println(nombre + " ha sido curado y ahora tiene " + puntosVida + " puntos de vida.");
    }
}

