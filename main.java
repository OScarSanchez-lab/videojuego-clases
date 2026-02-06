package videojuego_clases;

public class main {
    public main(String[] args) {
        entidad heroe = new guerrero(null, 0, 0, 0);
        heroe.setNombre("Arturo");
        heroe.setPuntosVida(150);
        heroe.setNivel(10);
        heroe.setAtaque(25);
        ((guerrero) heroe).setResistencia(30);
        System.out.println(heroe.toString());

        entidad hechiero = new mago(null, 0, 0, 0);
        hechiero.setNombre("Merlin");
        hechiero.setPuntosVida(60);
        hechiero.setNivel(10);
        hechiero.setAtaque(20);
        ((mago) hechiero).setMana(50);
        System.out.println(hechiero.toString());

        entidad monstruo = new bestia(null, 0, 0, 0);
        monstruo.setNombre("Mordor");
        monstruo.setPuntosVida(200);
        monstruo.setNivel(10);
        monstruo.setAtaque(30);
        ((bestia) monstruo).setFerocidad(40);
        System.out.println(monstruo.toString());


        java.util.ArrayList<entidad> entidades = new java.util.ArrayList<>();
        entidades.add(heroe);
        entidades.add(hechiero);
        entidades.add(monstruo);

        for (entidad e : entidades) {
            System.out.println(e.getNombre() + " ataca con un daño de: " + e.atacar());
        }

        String dañoGuerrero = ((guerrero) heroe).cartas("espada");
        String dañoMago = ((mago) hechiero).cartas("bola de fuego");
        String dañoBestia = ((bestia) monstruo).cartas("garra");   

        System.out.println(heroe.getNombre() + " ataca con la carta espada y hace un daño de: " + dañoGuerrero);
        System.out.println(hechiero.getNombre() + " ataca con la carta bola de fuego y hace un daño de: " + dañoMago);
        System.out.println(monstruo.getNombre() + " ataca con la carta garra y hace un daño de: " + dañoBestia);

        for (entidad e : entidades) {
            System.out.println(e.getNombre() + " ataca con la carta especial y hace un daño de: " + e.cartas("carta especial"));
        }

        String dañoEspecialGuerrero = ((guerrero) heroe).cartas("hacha");
        String dañoEspecialMago = ((mago) hechiero).cartas("rayo");
        String dañoEspecialBestia = ((bestia) monstruo).cartas("embestida");

        System.out.println(heroe.getNombre() + " ataca con la carta hacha y hace un daño de: " + dañoEspecialGuerrero);
        System.out.println(hechiero.getNombre() + " ataca con la carta rayo y hace un daño de: " + dañoEspecialMago);
        System.out.println(monstruo.getNombre() + " ataca con la carta embestida y hace un daño de: " + dañoEspecialBestia);

        for (entidad e : entidades) {
            System.out.println(e.getNombre() + " ataca con la carta especial y hace un daño de: " + e.cartas("carta especial"));
        }

        String dañoEspecialGuerrero2 = ((guerrero) heroe).cartas("escudo");
        String dañoEspecialMago2 = ((mago) hechiero).cartas("escudo magico");
        String dañoEspecialBestia2 = ((bestia) monstruo).cartas("rugido");

        System.out.println(heroe.getNombre() + " ataca con la carta escudo y hace un daño de: " + dañoEspecialGuerrero2);
        System.out.println(hechiero.getNombre() + " ataca con la carta escudo magico y hace un daño de: " + dañoEspecialMago2);
        System.out.println(monstruo.getNombre() + " ataca con la carta rugido y hace un daño de: " + dañoEspecialBestia2);

        System.out.println("Fin del combate");
    }
}
