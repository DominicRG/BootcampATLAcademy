package ejercicio2;

public class Mago extends Personaje{

    //Constructor para Mago Nv1
    public Mago(String nombre) {
        super(nombre, 1, 575, 575);
    }

    @Override
    public int atacar() {
        return lanzarHechizo();
    }

    @Override
    public void recibirDaño(int cantDañoRecibido) {
        super.recibirDaño(cantDañoRecibido);
    }

    @Override
    public void curarse() {
        int vidaACurar = (int) (0.12 * getBarraDeVida());
        super.setPuntosDeVida(super.getPuntosDeVida() + vidaACurar);
    }

    public int lanzarHechizo(){
        return 75;
    }
}
