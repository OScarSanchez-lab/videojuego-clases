package videojuego_clases;

public class bestia extends entidad {
    private int ferocidad;

    public void setFerocidad(int ataque) {
        ferocidad = ataque;
    }

    @Override
    public String toString() {
        return "Entidad" + 
        "[nombre=" + nombre + 
        ", puntosVida=" + puntosVida + 
        ", nivel=" + nivel + 
        ", ataque=" + ataque + 
        ", ferocidad=" + ferocidad + 
        "]";
    }
    
}
