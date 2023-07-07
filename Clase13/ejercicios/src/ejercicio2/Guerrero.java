package ejercicio2;

public class Guerrero extends Personaje{

    //Constructor para Guerrero Nv1
    public Guerrero(String nombre) {
        super(nombre, 1, 720, 720);
    }

    @Override
    public int atacar() {
        return golpeDeLanza();
    }

    @Override
    public void recibirDaño(int cantDañoRecibido) {
        super.recibirDaño(cantDañoRecibido);
    }

    @Override
    public void curarse() {
        int vidaACurar = (int) (0.2 * getBarraDeVida());
        setPuntosDeVida(getPuntosDeVida() + vidaACurar);
    }

    public int golpeDeLanza(){
        return 50;
    }
}
