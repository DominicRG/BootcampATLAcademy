package Stream.Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Sol");
        list.add("Luna");
        list.add("Estrella");

        list.stream().forEach(element -> {
            int index = list.indexOf(element);
            StringBuilder stringBuilder = new StringBuilder(element);
            list.set(index, stringBuilder.reverse().toString());
        });

        System.out.println(list);

        Scanner teclado = new Scanner(System.in);
        //System.out.println("Ingrese tres sinonimos: ");
    }
}
