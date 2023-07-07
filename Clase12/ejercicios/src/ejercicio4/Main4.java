package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        List<Alumno> alumnos = new ArrayList<>();

        System.out.println("¿Cuantos alumnos ingresara? --> ");
        int cantidadAlumnos =  teclado.nextInt();

        for (int i = 0; i < cantidadAlumnos; i++) {
            ingresarAlumno(teclado);
        }

    }

    private static void ingresarAlumno(Scanner teclado) {
        System.out.println("****************************************");
        Alumno alumno;
        List<Integer> notas = new ArrayList<>();

        System.out.println("Ingrese el nombre del alumno: ");
        teclado.nextLine();
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido del alumno: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese nota1: ");
        int nota1 = teclado.nextInt();
        System.out.println("Ingrese nota2: ");
        int nota2 = teclado.nextInt();
        System.out.println("Ingrese nota3: ");
        int nota3 = teclado.nextInt();
        System.out.println("Ingrese nota4: ");
        int nota4 = teclado.nextInt();

        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);
        alumno = new Alumno(nombre, apellido, notas);
        float promedio = alumno.promedio();

        System.out.println(alumno.toString() + "\n");

        System.out.println("El promedio del alumno es: " + promedio);
        System.out.println("****************************************");
    }
}
