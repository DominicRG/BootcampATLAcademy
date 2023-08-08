package Juego;

public class JuegoHelper {

    public static final int DIFICULTAD_ALTA = 10;
    public static final int DIFICULTAD_MEDIA = 5;
    public static final int DIFICULTAD_BAJA = 1;

    private JuegoHelper(){}

    private static final JuegoHelper instance = new JuegoHelper();

    public static JuegoHelper getInstance(){
        return  instance;
    }

    private int puntuacion;
    private int puntuacion2;
    private int dificultad;

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPuntuacion2() {
        return puntuacion2;
    }

    public void setPuntuacion2(int puntuacion2) {
        this.puntuacion2 = puntuacion2;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public void mostrarReglas(){
        System.out.println("Las reglas del juego son...");
    }
}
