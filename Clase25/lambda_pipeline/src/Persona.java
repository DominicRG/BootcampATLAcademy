public class Persona {

    private String nombre;
    private float salario;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public float getSalario() {
        return salario;
    }

    public Persona setSalario(float salario) {
        this.salario = salario;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public Persona calcularSalario(){
        System.out.println("Se calculo");
        return this;
    }
}
