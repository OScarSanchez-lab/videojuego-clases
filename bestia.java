package videojuego_clases;

public class bestia extends entidad {
    public bestia(String nombre, int vida, int nivel, int ataque) {
        super(nombre, vida, nivel, ataque);
        
    }

    private int ferocidad;

    public void setFerocidad(int ferocidad) {
        this.ferocidad = ferocidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", ferocidad=" + ferocidad + "]";
    }
    
}
