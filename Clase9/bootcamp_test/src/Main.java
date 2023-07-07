import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] personas = {"Lucas Moy" , "Aldo Angelini", "Julia Gomez", "Manuel Santillan", "Juan Guaranizo"};

        System.out.println("Ingrese su busqueda");
        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine();

//        for (int i = 0; i < personas.length; i++) {
//            String personaEncontrada = personas[i];
//            if(personaEncontrada.equalsIgnoreCase(busqueda))System.out.println(personaEncontrada);
//        }

        for(String persona : personas){
            if(persona.toLowerCase().contains(busqueda.toLowerCase()))System.out.println("La persona es: " + persona);
        }
    }
}
