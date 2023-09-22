package Stream.Ejercicio5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Mario", "Maria", "Lucas", "sofia", "Estrella"};
        List<Integer> longitudes = Arrays.stream(nombres).map(e -> e.length()).toList();
        System.out.println(longitudes);
    }
}
