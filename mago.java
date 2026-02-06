package videojuego_clases;

public class mago extends entidad {
    private int mana;

    public void setmana(int ataque) {
        mana = ataque;
    }

    @Override
    public String toString() {
        return "Entidad" + 
        "[nombre=" + nombre + 
        ", puntosVida=" + puntosVida + 
        ", nivel=" + nivel + 
        ", ataque=" + ataque + 
        ", mana=" + mana +
        "]";
    }
}
