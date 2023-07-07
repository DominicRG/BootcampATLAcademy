package ejercicio1;

import java.util.Scanner;

public class Circulo extends Figura{

    private double radio;

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        double area = (Math.PI * (radio * radio));
        return area;
    }

    public void cargarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el radio en cm");
        radio = teclado.nextDouble();
    }
}
