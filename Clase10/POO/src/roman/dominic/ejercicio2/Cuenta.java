package roman.dominic.ejercicio2;

import roman.dominic.ejercicio1.Persona;

public class Cuenta {
    private Persona titular;
    private double cantidad;

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public Cuenta() {
    }

    public Cuenta(Persona titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String mostrar(){
        return "\nTitular: "+this.titular.getNombre()+"\n"+
                "Dni: "+this.titular.getDni()+"\n"+
                "Saldo: "+this.getCantidad();
    }

    public void ingresar(double cantidad){
        if(cantidad<=0){
            return;
        }else{
            this.cantidad+=cantidad;
            System.out.println("\n***************************************");
            System.out.println("Deposito exitoso!");
            System.out.println(mostrar());
        }
    }

    public void retirar(double cantidad){
        if(cantidad>this.cantidad){
            this.cantidad -= cantidad;
            System.out.println("\n***************************************");
            System.out.println("Retiro exitoso");
            System.out.println(ANSI_YELLOW + "WARNING: Cuenta sobregirada" + ANSI_RESET);
            System.out.println(mostrar());
        }else{
            this.cantidad -= cantidad;
            System.out.println("\n***************************************");
            System.out.println("Retiro exitoso");
            System.out.println(mostrar());
        }
    }
}
