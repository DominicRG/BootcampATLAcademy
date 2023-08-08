import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //PIPELINE
        /*Persona persona = new Persona();
        persona.setEdad(12);
        persona.setNombre("Lucas");
        persona.setSalario(120000);

        persona.setEdad(12).setNombre("Lucas").setSalario(12000).calcularSalario();*/

        //STREAMS & LAMBDAS
        List<String> frutas = new ArrayList<>();
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Sandía");

        frutas.stream().filter(fruta -> fruta.startsWith("M"))
                .filter(fruta -> fruta.contains("a"))
                .filter(fruta -> fruta.contains("n"))
                .forEach(fruta -> System.out.println(fruta));
    }
}
