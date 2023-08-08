package Stream.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listaDeNombres = new ArrayList<>();
        listaDeNombres.add("Lucas");
        listaDeNombres.add("Sabrina");
        listaDeNombres.add("Pepe");

        List<String> nombresEnMayuscula = listaDeNombres.stream().map(nombre -> nombre.toUpperCase()).toList();

        nombresEnMayuscula.forEach(nombre -> System.out.println(nombre));
    }
}
