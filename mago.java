package videojuego_clases;

public class mago extends entidad {
    public mago(String nombre, int vida, int nivel, int ataque) {
        super(nombre, vida, nivel, ataque);
        
    }

    private int mana;

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() + ", mana=" + mana + "]";
    }
}
