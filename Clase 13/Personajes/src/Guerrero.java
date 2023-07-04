public class Guerrero extends Personaje {
    private int fuerzaAtaque;

    public Guerrero(String nombre, int nivel, int puntosVida, int fuerzaAtaque) {
        super(nombre, nivel, puntosVida);
        this.fuerzaAtaque = fuerzaAtaque;
    }

    public int getFuerzaAtaque() {
        return fuerzaAtaque;
    }

    public void setFuerzaAtaque(int fuerzaAtaque) {
        this.fuerzaAtaque = fuerzaAtaque;
    }

    public void golpeEspada(Personaje objetivo) {
        int danio = fuerzaAtaque * 2;
        System.out.println(getNombre() + " golpea con su espada a " + objetivo.getNombre() + " causando " + danio + " puntos de daño.");
        objetivo.recibirDanio(danio);
    }
}
