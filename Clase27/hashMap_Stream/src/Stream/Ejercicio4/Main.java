package Stream.Ejercicio4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] list = {10,22,33,9,3,4};
        List<Integer> list2 = Arrays.stream(list).map(e -> e*2).toList();
        System.out.println(list2);
    }
}
