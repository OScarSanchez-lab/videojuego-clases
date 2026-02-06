package videojuego_clases;

public class entidad {
    protected String nombre;
    protected int puntosVida;
    protected int nivel;
    protected int ataque;

    public entidad(String nombre, int vida, int nivel, int ataque) {
        this.nombre = nombre;
        this.puntosVida = vida;
        this.nivel = nivel;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Entidad[" +
                "nombre=" + nombre +
                ", puntosVida=" + puntosVida +
                ", nivel=" + nivel +
                ", ataque=" + ataque +
                "]";
    }
}