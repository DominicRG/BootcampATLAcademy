import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        jugarAlAmigoSecreto();
    }

    private static void jugarAlAmigoSecreto() {
        System.out.println("¿Cuantas personas van a jugar al Amigo Secreto?");
        Scanner teclado = new Scanner(System.in);
        int cantidadPersonas = teclado.nextInt();

        String[] listaDeNombres = new String[cantidadPersonas];
        ingresarNombresDeJugadores(teclado, listaDeNombres);

        String[] agasajados = new String[cantidadPersonas];
        asignarAgasajadosAPersonas(cantidadPersonas, listaDeNombres, agasajados);

        mostrarAgasajadoAJugadores(teclado, listaDeNombres, agasajados);
    }

    private static void mostrarAgasajadoAJugadores(Scanner teclado, String[] listaDeNombres, String[] agasajados) {
        for (int i = 0; i < agasajados.length; i++) {
            String nombreDeLaPersona = listaDeNombres[i];

            teclado.nextLine();
            System.out.println("Que "+nombreDeLaPersona+" se acerque a la computadora y presione ENTER para continuar");
            teclado.nextLine();

            String nombreAgasajado = agasajados[i];

            teclado.nextLine();
            System.out.println("Le tienes que hacer un regalo a "+ nombreAgasajado +". Presiona ENTER para continuar");
            teclado.nextLine();

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }

    private static void asignarAgasajadosAPersonas(int cantidadPersonas, String[] listaDeNombres, String[] agasajados) {
        for (int i = 0; i < agasajados.length; i++) {
            int indice = i + 1;
            if(indice >= cantidadPersonas){
                indice = 0;
            }
            agasajados[i] = listaDeNombres[indice];
        }
    }

    private static void ingresarNombresDeJugadores(Scanner teclado, String[] listaDeNombres) {
        for (int i = 0; i < listaDeNombres.length; i++) {
            System.out.println("Ingrese el nombre de una persona:");
            String nombreDeLaPersona = teclado.next();
            listaDeNombres[i] = nombreDeLaPersona;
        }
    }
}
