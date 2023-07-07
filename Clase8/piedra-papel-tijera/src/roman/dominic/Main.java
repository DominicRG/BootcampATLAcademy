package roman.dominic;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    static int menu = 0;
    static int ronda = 0;
    static String[] opc = {"Piedra", "Papel", "Tijera"};

    public static void main(String[] args) {
        Main app = new Main();

        do {
            menu = app.menu();

            switch (menu) {
                case 1 -> app.subMenu();
                case 2 -> app.instrucciones();
                case 3 -> app.salir();
                default -> System.err.println("Ingrese las opciones del 1 al 3 por favor");
            }

        }while (menu != 3);
    }

    private String obtenerOpcAleat(String[] opc) {
        int numAleat = (int)(Math.random() * 10);
        if(numAleat>2){
            while(numAleat>2){
                numAleat = (int)(Math.random() * 10);
            }
        }
        return opc[numAleat];
    }

    public int menu(){
        int menu = 0;

        System.out.println("\nBienvenido al juego Piedra - Papel o Tijera!");
        System.out.println("--------------------------------------------");
        System.out.println("Rondas ganadas: "+ ronda);
        System.out.println("--------------------------------------------");
        System.out.println("Presione 1 para jugar");
        System.out.println("Presione 2 para leer las instrucciones");
        System.out.println("Presione 3 para salir");
        System.out.println("--------------------------------------------");
        System.out.println("Por favor seleccione la operacion que desea realizar: ");
        menu = scanner.nextInt();
        return menu;
    }

    public void instrucciones(){
        System.out.println("Bienvenido al juego de Piedra, Papel o Tijeras.\n" +
                "\n" +
                "Objetivo:\n" +
                "El objetivo del juego es vencer a la computadora seleccionando la opción ganadora en cada turno.\n" +
                "\n" +
                "Reglas:\n" +
                "\n" +
                "Piedra vence a tijeras.\n" +
                "Tijeras vence a papel.\n" +
                "Papel vence a piedra.\n" +
                "Cómo ganar:\n" +
                "\n" +
                "1. Selecciona tu jugada:\n" +
                "\n" +
                "   * Escribe \"piedra\" si quieres elegir piedra.\n" +
                "   * Escribe \"papel\" si quieres elegir papel.\n" +
                "   * Escribe \"tijeras\" si quieres elegir tijeras.\n" +
                "2. La computadora seleccionará su jugada automáticamente.\n" +
                "\n" +
                "3. Determinación del resultado:\n" +
                "\n" +
                "   * Si tu jugada vence a la jugada de la computadora, ganas el turno.\n" +
                "   * Si la jugada de la computadora vence a tu jugada, pierdes el turno.\n" +
                "   * Si ambos eligen la misma opción, hay un empate y se juega otro turno.\n" +
                "   * Una ronda se crea al ingresar al sub menu de juego, al ganar, perder o empatar con la computadora \n" +
                "     y regresar al menu principal se habra jugado una unica ronda.\n" +
                "4. Repite los pasos 1 al 3 hasta que se decida un ganador.\n" +
                "\n" +
                "Gana el maximo de rondas posibles para ingresar al podio de ganadores con tu mayor puntaje.\n" +
                "¡Diviértete jugando Piedra, Papel o Tijeras contra la computadora!");
        scanner.nextLine();
        System.out.println("--------------------------------------------");
        System.out.println("PRESIONE ENTER PARA CONTINUAR ...");
        scanner.nextLine();
    }

    public void subMenu(){
        boolean in = false;
        String eleccionJ = "";
        String eleccionPC = "";

        int puntuacionJ = 0;
        int puntuacionPC = 0;

        do {
            eleccionPC = obtenerOpcAleat(opc);

            System.out.println("\nListo para jugar?");
            System.out.println("---Ingrese \"Salir\" si desea regresar al menu principal---");
            System.out.println("--------------------------------------------");
            System.out.println("Jugador: "+puntuacionJ);
            System.out.println("PC: "+puntuacionPC);
            System.out.println("--------------------------------------------");
            System.out.println("Es tu turno: ");
            eleccionJ = scanner.next();

            String capitalizaEleccionJ =  eleccionJ.substring(0, 1).toUpperCase() + eleccionJ.substring(1).toLowerCase();

            switch (capitalizaEleccionJ) {
                case "Piedra" -> {
                    System.out.println("PC :\n" + eleccionPC);
                    if (capitalizaEleccionJ.equalsIgnoreCase(eleccionPC)) {
                        System.out.println("EMPATE :/");
                    } else if (eleccionPC.equalsIgnoreCase("Papel")) {
                        System.out.println("TU PIERDES :(");
                        puntuacionPC++;
                    } else if (eleccionPC.equalsIgnoreCase("Tijera")) {
                        System.out.println("TU GANAS :D");
                        puntuacionJ++;
                    }
                }
                case "Papel" -> {
                    System.out.println("PC :\n" + eleccionPC);
                    if (capitalizaEleccionJ.equalsIgnoreCase(eleccionPC)) {
                        System.out.println("EMPATE :/");
                    } else if (eleccionPC.equalsIgnoreCase("Tijera")) {
                        System.out.println("TU PIERDES :(");
                        puntuacionPC++;
                    } else if (eleccionPC.equalsIgnoreCase("Piedra")) {
                        System.out.println("TU GANAS :D");
                        puntuacionJ++;
                    }
                }
                case "Tijera" -> {
                    System.out.println("PC :\n" + eleccionPC);
                    if (capitalizaEleccionJ.equalsIgnoreCase(eleccionPC)) {
                        System.out.println("EMPATE :/");
                    } else if (eleccionPC.equalsIgnoreCase("Papel")) {
                        System.out.println("TU GANAS :D");
                        puntuacionJ++;
                    } else if (eleccionPC.equalsIgnoreCase("Piedra")) {
                        System.out.println("TU PIERDES :(");
                        puntuacionPC++;
                    }
                }
                case "Salir" -> {
                    if(puntuacionJ>puntuacionPC){
                        ronda++;
                        System.out.println("Ganaste la ronda!");
                    } else if (puntuacionJ<puntuacionPC) {
                        System.out.println("Perdiste la ronda");
                    }else{
                        System.out.println("Has empatado la ronda");
                    }
                    in = true;
                }
                default -> System.err.println("--- Debe ingresar solo Piedra, Papel o  Tijera para jugar ---\n" +
                        "--- Si desea regresar al menu principal ingrese \"Salir\" ---");
            }
            System.out.println("--------------------------------------------");
        }while(!in);
    }

    public void salir() {
        System.out.println("Gracias por jugar Piedra, Papel o Tijeras!");
        System.exit(0);
    }

}
