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
    public String atacar() {
        return String.valueOf(ataque + ferocidad); // El ataque de la bestia se incrementa por su ferocidad
    }

    public String cartas(String carta) {
        switch (carta) {
            case "garra":
                return String.valueOf(ataque * 2 + ferocidad * 2); // La bestia hace más daño con esta carta
            case "mordisco":
                return String.valueOf(ataque * 2 + ferocidad); // La bestia hace aún más daño con esta carta
            case "rugido":
                return String.valueOf(ataque + ferocidad * 5); // La bestia hace menos daño con esta carta
            case "embestida":
                return String.valueOf(ataque * 3 + ferocidad / 3); // La bestia hace mucho más daño con esta carta
            default:
                return "0";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", ferocidad=" + ferocidad + "]";
    }
    
}
