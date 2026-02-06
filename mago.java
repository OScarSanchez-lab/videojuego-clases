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
    public String atacar() {
        return String.valueOf(ataque + mana); // El ataque del mago se incrementa por su mana
    }

    public String cartas(String carta) {
        switch (carta) {
            case "bola de fuego":
                return String.valueOf(ataque * 2); // El mago hace más daño con esta carta
            case "rayo":
                return String.valueOf(ataque * 3); // El mago hace aún más daño con esta carta
            case "escudo magico":
                return String.valueOf(ataque / 2 + puntosVida + 50); // El mago hace la mitad de daño con estas cartas
            case "curacion":
                return String.valueOf(ataque / 5 + puntosVida); // El mago hace la mitad de daño con estas cartas 
            default:
                return "0";
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", mana=" + mana + "]";
    }
}
