package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    static List<Personaje> personajes = new ArrayList<>();

    public static void main(String[] args) {
        boolean menu = true;

        do {
            System.out.println("---- MENU ----");
            System.out.println("1. Crear personaje");
            System.out.println("2. Combate");
            System.out.println("3. Salir");
            int respuestaUsuario = teclado.nextInt();

            switch (respuestaUsuario){
                case 1 -> crearPersonaje();
                case 2 -> Combate();
                case 3 -> menu = false;
                default -> System.out.println("Solo puede ingresar las opciones del Menu(1-2-3)");
            }
        }while(menu);

    }

    private static void Combate() {
        System.out.println("Entramos al combate: ");
        for (Personaje personaje : personajes) {
            String tipoPersonaje = personaje.getClass().toString().substring(17);
            System.out.println(""+ (personajes.indexOf(personaje)+1) + ". " + personaje.getNombre() + " - " + tipoPersonaje);
        }

        Random random = new Random();
        int numAleat = random.nextInt(personajes.size());

        System.out.println("\n-- Pelearas VS la PC --");
        System.out.println("Elige tu personaje para la batalla: ");
        int respuestaUsuario = teclado.nextInt();

        Personaje personajeUsuario = personajes.get(respuestaUsuario - 1);
        Personaje personajePC = personajes.get(numAleat);

        System.out.println("Elegiste luchar con: " + personajeUsuario.getNombre());
        System.out.println(personajeUsuario.toString());

        System.out.println("Te enfrentaras a: " + personajePC.getNombre());
        System.out.println(personajePC.toString());

        boolean subMenuCombate = true;
        do {
            System.out.println("\nMenu de Combate: ");
            System.out.println("Personaje: " + personajeUsuario.getNombre());
            System.out.println("1. Atacar");
            System.out.println("2. Curar");
            System.out.println("3. Salir del combate");
            int opcUsuario = teclado.nextInt();

            switch (opcUsuario){
                case 1 -> {
                    int dañoOcasionado = personajeUsuario.atacar();
                    personajePC.recibirDaño(dañoOcasionado);
                }
                case 2 -> personajeUsuario.curarse();
                case 3 -> subMenuCombate = false;
            }



        }while (subMenuCombate);

    }

    private static void crearPersonaje() {
        boolean subMenu = true;

        do {
            System.out.println("\n¿Qué personaje desea crear?");
            System.out.println("1. Guerrero");
            System.out.println("2. Arquero");
            System.out.println("3. Mago");
            System.out.println("4. Regresar al Menú Principal");
            int respuestaUsuario = teclado.nextInt();

            switch (respuestaUsuario){
                case 1 -> crearGuerrero();
                case 2 -> crearArquero();
                case 3 -> crearMago();
                case 4 -> subMenu = false;
                default -> System.out.println("Solo puede ingresar las opciones del 1 - 4");
            }
        }while(subMenu);

    }

    private static void crearMago() {
        System.out.println("\n¿Qué nombre tendra tu mago?");
        teclado.nextLine();
        String nombre = teclado.nextLine();
        Mago mago = new Mago(nombre);
        personajes.add(mago);
    }

    private static void crearArquero() {
        System.out.println("\n¿Qué nombre tendra tu arquero?");
        teclado.nextLine();
        String nombre = teclado.nextLine();
        Arquero arquero = new Arquero(nombre);
        personajes.add(arquero);
    }

    private static void crearGuerrero() {
        System.out.println("\n¿Qué nombre tendra tu guerrero?");
        teclado.nextLine();
        String nombre = teclado.nextLine();
        Guerrero guerrero = new Guerrero(nombre);
        personajes.add(guerrero);
    }
}
