package Stream.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Float> temperaturas = new ArrayList<>();
        temperaturas.add(68f);
        temperaturas.add(86f);
        temperaturas.add(70f);
        temperaturas.add(74f);
        temperaturas.add(75f);
        temperaturas.add(89f);

        List<Float> resultado = new ArrayList<>();
        /*for (Float tempFahrenheit: temperaturas) {
            Float tempCelsius = (tempFahrenheit - 32) * 0.5556f;
            resultado.add(tempCelsius);
            System.out.println(tempCelsius);
        }*/

        /*temperaturas.forEach(tempFahrenheit -> {
            Float tempCelsius = (tempFahrenheit - 32) * 0.5556f;
            resultado.add(tempCelsius);
            System.out.println(tempCelsius);
        });*/

        resultado = temperaturas.stream().map(tempFahrenheit -> (tempFahrenheit - 32) * 0.5556f ).toList();
        resultado.forEach(temperatura -> System.out.println("la temperatura convertida es: " + temperatura));
    }
}
