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
    }
}
