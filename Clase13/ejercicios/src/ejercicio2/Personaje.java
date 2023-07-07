package ejercicio2;

public abstract class Personaje {

    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private int barraDeVida;

    public Personaje(String nombre, int nivel, int puntosDeVida, int barraDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.barraDeVida = barraDeVida;
        System.out.println("Personaje creado de manera exitosa!");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getBarraDeVida() {
        return barraDeVida;
    }

    public void setBarraDeVida(int barraDeVida) {
        this.barraDeVida = barraDeVida;
    }

    public abstract int atacar();
    public void recibirDaño(int cantDañoRecibido){
        setPuntosDeVida(getPuntosDeVida() - cantDañoRecibido);
    };
    public abstract void curarse();

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida +
                ", barraDeVida=" + barraDeVida ;
    }
}
