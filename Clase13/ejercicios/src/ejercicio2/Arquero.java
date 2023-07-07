package ejercicio2;

public class Arquero extends Personaje{

    //Constructor para Arquero Nv1
    public Arquero(String nombre) {
        super(nombre, 1, 650, 650);
    }

    @Override
    public int atacar() {
        return dispararFlecha();
    }

    @Override
    public void recibirDaño(int cantDañoRecibido) {
        super.recibirDaño(cantDañoRecibido);
    }

    @Override
    public void curarse() {
        int vidaACurar = (int) (0.15 * getBarraDeVida());
        super.setPuntosDeVida(super.getPuntosDeVida() + vidaACurar);
    }

    public int dispararFlecha(){
        return 60;
    }
}
