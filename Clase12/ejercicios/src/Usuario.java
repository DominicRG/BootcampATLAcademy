public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String telefono;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String email, String password, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "\n" +
                "id=" + id +
                ",\nnombre='" + nombre + '\'' +
                ",\napellido='" + apellido + '\'' +
                ",\nemail='" + email + '\'' +
                ",\ntelefono='" + telefono + '\'' +
                '}';
    }
}
