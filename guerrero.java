package videojuego_clases;

public class guerrero extends entidad {
    private int resistencia;

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", resistencia=" + resistencia + "]";
    }

}
