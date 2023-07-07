package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        List<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(new Pregunta("Soy un felino muy ágil y salvaje, mis rayas me hacen destacar. ¿Quién soy?", "Tigre"));
        preguntas.add(new Pregunta("Vuelo sin alas por el cielo azul, con picoteo constante, buscando alimento. ¿Qué soy?", "Ave"));
        preguntas.add(new Pregunta("En el bosque me encuentras, escondido entre los árboles. Mi cola es esponjosa y mis ojos brillan en la noche. ¿Quién soy?", "Mapache"));
        preguntas.add(new Pregunta("Soy el rey de la selva, mi rugido hace temblar. ¿Qué animal soy?", "Leon"));
        preguntas.add(new Pregunta("Tengo aletas y nado en el mar, soy amigable y adoro saltar. ¿Qué criatura marina soy?", "Delfin"));

        Scanner teclado = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("Listo para unas adivinanzas, seran 5, asi que concentrate.");
        System.out.println("...Vamos!\n");

        for (int i = 0; i < 5; i++) {
            System.out.println(preguntas.get(i).getPregunta());
            String respuesta = teclado.nextLine();
            System.out.println(preguntas.get(i).comprobarRespuesta(respuesta) ? "Respuesta correcta!" : "Has fallado, la respuesta es: " + preguntas.get(i).getRespuesta());
            System.out.println();
        }

        System.out.println("Gracias por jugar adivinanzas!");

    }
}
