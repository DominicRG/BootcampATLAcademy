package figuras;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        Triangulo triangulo = new Triangulo();
        triangulo.setAlto(10);
        triangulo.setAncho(5);
        figuras.add(triangulo);

        Circulo circulo = new Circulo();
        circulo.setRadio(5);
        figuras.add(circulo);

        for (FiguraGeometrica figura: figuras) {
            System.out.println("Area total: " + figura.calcularArea());
        }

    }
}
