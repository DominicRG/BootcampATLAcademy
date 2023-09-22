package Stream.Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] tabla = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("De que número desea su tabla de multiplicar?");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        Arrays.stream(tabla).forEach(e -> System.out.println(num + " * " + e + " = " + (num * e)));
    }
}
