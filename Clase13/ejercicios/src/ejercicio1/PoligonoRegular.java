package ejercicio1;

import java.util.Scanner;

public abstract class PoligonoRegular extends  Figura{

    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void cargarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la altura en cm");
        altura = teclado.nextDouble();
        System.out.println("Ingresa la base en cm");
        base = teclado.nextDouble();
    }


    public abstract double calcularArea();
}
