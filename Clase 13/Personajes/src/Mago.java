public class Mago extends Personaje {
    private int puntosMana;

    public Mago(String nombre, int nivel, int puntosVida, int puntosMana) {
        super(nombre, nivel, puntosVida);
        this.puntosMana = puntosMana;
    }

    public int getPuntosMana() {
        return puntosMana;
    }

    public void setPuntosMana(int puntosMana) {
        this.puntosMana = puntosMana;
    }

    public void lanzarHechizo(Personaje objetivo, int puntosHechizo) {
        if (puntosMana >= puntosHechizo) {
            System.out.println(getNombre() + " lanza un hechizo a " + objetivo.getNombre() + "!");
            puntosMana -= puntosHechizo;
            objetivo.recibirDanio(puntosHechizo);
        } else {
            System.out.println(getNombre() + " no tiene suficientes puntos de mana para lanzar el hechizo.");
        }
    }
}
