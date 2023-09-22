import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("SMS", "Un mensaje de texto");
        diccionario.put("LOL", "Reirse");
        diccionario.put("AFK", "Que la persona no esta en la computadora");
        diccionario.put("OMG", "Oh my god");
        diccionario.put("ASAP", "Tan pronto como puedas");

        System.out.println(diccionario.values());
    }
}
