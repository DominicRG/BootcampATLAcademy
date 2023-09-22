package HashMap.ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> listaDeContactos = new HashMap<>();
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un dni: ");
            String dni = teclado.nextLine();
            System.out.println("Ingrese un telefono: ");
            String tel = teclado.nextLine();
            System.out.println("Ingrese un nombre: ");
            String nombre = teclado.nextLine();

            Person person = new Person();
            person.setDni(dni);
            person.setNombre(nombre);
            person.setTelefono(tel);

            listaDeContactos.put(dni, person);
        }

        System.out.println("Ingrese el dni a buscar: ");
        String dni = teclado.nextLine();
        Person person = listaDeContactos.get(dni);
        System.out.println(person.toString());
    }
}
