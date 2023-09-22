package HashMap.ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String texto = "Hola, que tal? Que estas haciendo?";
        String[] palabras = texto.split(" ");

        Map<String, Integer> conteoDePalabras = new HashMap<>();

        for(String palabra : palabras){
            String palabraLimpia = StringUtil.limpiarPalabra(palabra);
            Integer contador = conteoDePalabras.get(palabraLimpia);
            if(contador == null){
                contador = 0;
            }
            contador++;
            conteoDePalabras.put(palabraLimpia, contador);
        }

        System.out.println(conteoDePalabras);
    }


}
