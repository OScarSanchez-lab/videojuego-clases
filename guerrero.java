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
    public String atacar() {
        return String.valueOf(ataque + resistencia); // El ataque del guerrero se incrementa por su resistencia
    }

    public String cartas(String carta) {
        switch (carta) {
            case "espada":
                return String.valueOf(ataque * 5 + resistencia / 2); // El guerrero hace más daño con esta carta
            case "hacha":
                return String.valueOf(ataque * 2 + resistencia); // El guerrero hace aún más daño con esta carta
            case "escudo":
                return String.valueOf(ataque / 2 + resistencia * 3); // El guerrero hace menos daño con esta carta
            case "armadura":
                return String.valueOf(ataque / 5 + resistencia * 5); // El guerrero hace mucho menos daño con esta carta
            default:
                return "0";
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", resistencia=" + resistencia + "]";
    }

}
