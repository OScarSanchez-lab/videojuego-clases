package videojuego_clases;

public class guerrero extends entidad {
    private int resistencia;

    public void setResistencia(int ataque) {
        resistencia = ataque;
    }

    @Override
    public String toString() {
        return "Entidad" + 
        "[nombre=" + nombre + 
        ", puntosVida=" + puntosVida + 
        ", nivel=" + nivel + 
        ", ataque=" + ataque + 
        ", resistencia=" + resistencia + 
        "]";
    }
     
    
}
