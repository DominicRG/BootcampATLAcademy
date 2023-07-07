import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Ingrese el costo del producto");
        Scanner teclado = new Scanner(System.in);
        float costoDelProducto = teclado.nextFloat();

        System.out.println("Ingrese la cantidad pagada");
        float cantidadPagada = teclado.nextFloat();

        if(cantidadPagada<costoDelProducto){
            float cantidadFaltante = costoDelProducto - cantidadPagada;
            System.out.println("Falta abonar: $" + cantidadFaltante);
        }else{
            float cambioTotal = cantidadPagada - costoDelProducto;
            System.out.println("El cambio total es: $" + cambioTotal);
        }
    }
}
