package videojuego_clases;

public class mago extends entidad {
    private int mana;

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() + ", mana=" + mana + "]";
    }
}
