package HashMap.ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> diccionarioITaPT = new HashMap<>();
        diccionarioITaPT.put("spaghetti", "espaguete");
        diccionarioITaPT.put("auto", "carro");
        diccionarioITaPT.put("programmazione", "programação");
        diccionarioITaPT.put("mela", "maçã");
        diccionarioITaPT.put("gamba", "perna");
        diccionarioITaPT.put("birra", "cerveja");
        diccionarioITaPT.put("lavoro", "Trabalhar");
        diccionarioITaPT.put("errore", "erro");
        diccionarioITaPT.put("incontro", "encontro");
        diccionarioITaPT.put("compilare", "compilar");
        diccionarioITaPT.put("burro", "espaguete");
        diccionarioITaPT.put("farfalla", "borboleta");

        System.out.println("Escribe una palabra en italiano y la traducire al portugues");
        Scanner teclado = new Scanner(System.in);
        String palabraEnIT = teclado.nextLine();
        String palabraEnPT = diccionarioITaPT.get(palabraEnIT);
        String traduccion = String.format("La palabra %s en portugues se dice %s", palabraEnIT, palabraEnPT);
        System.out.println(traduccion);

    }
}
