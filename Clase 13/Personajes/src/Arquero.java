public class Arquero extends Personaje {
    private int precision;

    public Arquero(String nombre, int nivel, int puntosVida, int precision) {
        super(nombre, nivel, puntosVida);
        this.precision = precision;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public void dispararFlecha(Personaje objetivo) {
        int danio = (int) (precision * 1.5);
        System.out.println(getNombre() + " dispara una flecha a " + objetivo.getNombre() + " causando " + danio + " puntos de daño.");
        objetivo.recibirDanio(danio);
    }
}