package videojuego_clases;

public class guerrero extends entidad {
    public guerrero(String nombre, int vida, int nivel, int ataque) {
        super(nombre, vida, nivel, ataque);
    
    }

    private int resistencia;

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", resistencia=" + resistencia + "]";
    }

}
