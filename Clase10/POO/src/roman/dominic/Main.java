package roman.dominic;

import roman.dominic.ejercicio1.Persona;
import roman.dominic.ejercicio2.Cuenta;

public class Main {
    public static void main(String[] args) {
        Persona daniel = new Persona(1,"Daniel", 17, "20-05-2001", "74146019");

//        System.out.println(daniel.mostrar());
//        System.out.println(daniel.esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad");

        Cuenta cuentaD = new Cuenta(daniel, 2000);
        System.out.println(cuentaD.mostrar());
        cuentaD.ingresar(-25);
        cuentaD.ingresar(500);
        cuentaD.retirar(300);
        cuentaD.retirar(2500);

    }
}
