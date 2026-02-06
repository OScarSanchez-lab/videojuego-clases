package videojuego_clases;

public class bestia extends entidad {
    private int ferocidad;

    public void setFerocidad(int ferocidad) {
        this.ferocidad = ferocidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", ferocidad=" + ferocidad + "]";
    }
    
}
