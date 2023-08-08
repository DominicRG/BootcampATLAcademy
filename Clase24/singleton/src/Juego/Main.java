package Juego;

public class Main {
    public static void main(String[] args) {
        if (JuegoHelper.getInstance().getDificultad() == JuegoHelper.DIFICULTAD_BAJA){
            JuegoHelper.getInstance().setPuntuacion(1000);
        } else{
            JuegoHelper.getInstance().getPuntuacion();
        }
    }
}
