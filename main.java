package videojuego_clases;

public class main {
    public main(String[] args) {
        entidad heroe = new guerrero();
        
        heroe.setNombre("Arturo");
        heroe.setPuntosVida(150);
        heroe.setNivel(10);
        heroe.setAtaque(25);
        ((guerrero) heroe).setResistencia(15);
        
        System.out.println(heroe.toString());


        entidad hechiero = new mago();
        hechiero.setNombre("Merlin");
        hechiero.setPuntosVida(60);
        hechiero.setNivel(10);
        hechiero.setAtaque(20);
        ((mago) hechiero).setmana(30);

        System.out.println(hechiero.toString());

        entidad monstruo = new bestia();
        monstruo.setNombre("Mordor");
        monstruo.setPuntosVida(200);
        monstruo.setNivel(10);
        monstruo.setAtaque(30);
        ((bestia) monstruo).setFerocidad(20);

        System.out.println(monstruo.toString());
    }
}
