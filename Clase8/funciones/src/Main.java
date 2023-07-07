public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        System.out.println(app.generadorPassword());
        System.out.println(app.calcularAreaCuadrado(5));
        System.out.println(app.calcularAreaTriangulo(10, 6));
    }

    public double calcularAreaCuadrado(double lado){
        return lado * lado;
    }

    public double calcularAreaTriangulo(double base, double altura){
        return (base * altura)/2;
    }

    public String generadorPassword(){
        String texto = "JDPG";
        double numeroGenerado = Math.round(Math.random() * 10000);
        String password = texto + numeroGenerado;
        return password;
    }
}
