package videojuego_clases;

public class mago extends entidad {
    public mago(String nombre, int vida, int nivel, int ataque) {
        super(nombre, vida, nivel, ataque);
    }

    private int mana;

    public void setMana(int mana) {
        this.mana = mana;
    }
    public int atacar() {
        if (mana >= 10) {
            mana -= 10;
            return ataque * 2; // El mago hace el doble de daño
        } else {
            return ataque; // Si no tiene suficiente mana, hace daño normal
        }
    }

    public int cartas(String carta) {
        switch (carta) {
            case "bola de fuego":
                return ataque * 2; // El mago hace el doble de daño con estas cartas
            case "rayo":
                return ataque * 3; // El mago hace el triple de daño con estas cartas
            case "escudo magico":
                return ataque / 2 + puntosVida + 50; // El mago hace la mitad de daño con estas cartas
            case "curacion":
                return ataque / 5 + puntosVida; // El mago hace la mitad de daño con estas cartas
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", mana=" + mana + "]";
    }
}
