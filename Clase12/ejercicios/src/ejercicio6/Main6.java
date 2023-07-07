package ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaDeReproduccion listaDeReproduccion;
        List<Cancion> canciones = new ArrayList<>();

        System.out.println("Ingresa el nombre de tu nueva Playlist: ");
        String nombreP = teclado.nextLine();
        System.out.println("Ingresa la descripcion de tu nueva Playlist: ");
        String descripcionP = teclado.nextLine();
        System.out.println("Cuantas canciones deseas agregar a tu Playlist: ");
        int numCanciones =  teclado.nextInt();

        agregarCanciones(teclado, canciones, numCanciones);

        listaDeReproduccion = new ListaDeReproduccion(nombreP, descripcionP, canciones);

        reproducirPlaylist(listaDeReproduccion);
    }

    private static void reproducirPlaylist(ListaDeReproduccion listaDeReproduccion) {
        System.out.println("----------------------------");
        System.out.println("Reproduciendo Playlist: " + listaDeReproduccion.getNombre());
        System.out.println("----------------------------");

        for (int i = 0; i < listaDeReproduccion.getCanciones().size(); i++) {
            System.out.println("----------------------------");
            System.out.println(listaDeReproduccion.getCanciones().get(i).toString());
            System.out.println("----------------------------");
        }
    }

    private static void agregarCanciones(Scanner teclado, List<Cancion> canciones, int numCanciones) {
        for (int i = 0; i < numCanciones; i++) {
            System.out.println("----------------------------");
            teclado.nextLine();
            System.out.println("Ingresa el nombre de la cancion: ");
            String tituloC = teclado.nextLine();
            System.out.println("Ingresa el artista de la cancion: ");
            String artista = teclado.nextLine();
            System.out.println("Ingresa la duracion de la cancion: ");
            float duracion = teclado.nextFloat();
            System.out.println("----------------------------");

            canciones.add(new Cancion(tituloC, artista, duracion));
        }
    }
}
