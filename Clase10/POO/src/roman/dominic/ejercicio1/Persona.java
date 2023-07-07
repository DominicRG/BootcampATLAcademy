package roman.dominic.ejercicio1;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String fechaDeNacimiento;
    private String dni;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String fechaDeNacimiento, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String mostrar(){
        return "Nombre: "+ this.nombre+"\n"+
                "DNI: "+ this.dni+"\n"+
                "Edad: "+ this.edad+"\n"+
                "Fecha de nacimiento: "+ this.fechaDeNacimiento;
    }

    public boolean esMayorDeEdad(){
        return this.edad>=18 ? true : false;
    }
}
