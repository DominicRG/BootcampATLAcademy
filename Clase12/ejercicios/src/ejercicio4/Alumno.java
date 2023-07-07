package ejercicio4;

import java.util.List;

public class Alumno {

    private String nombre;
    private String apellido;
    private List<Integer> notas;

    public Alumno(String nombre, String apellido, List<Integer> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public float promedio() {
        float suma = 0;
        float promedio = 0;
        for (int nota : this.notas) {
            suma += nota;
        }
         return promedio = suma / this.notas.size();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", notas=" + notas +
                '}';
    }
}
