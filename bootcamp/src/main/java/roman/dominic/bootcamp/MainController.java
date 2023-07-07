package roman.dominic.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/transformar-a-codigo-morse/{texto}")
    public String codigoMorse(@PathVariable String texto){

        String codigoTransformado = "";

        for (int i = 0; i < texto.length(); i++) {
            String letraDeTexto = "" + texto.charAt(i);

            codigoTransformado = convertirLetraACodigoMorse(codigoTransformado, letraDeTexto);
        }

        return codigoTransformado;
    }

    private static String convertirLetraACodigoMorse(String codigoTransformado, String letraDeTexto) {

        String[] tablaABC = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " "};
        String[] tablaCodigoMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " "};

        for (int j = 0; j < tablaABC.length; j++) {
            String letraTablaABC = tablaABC[j];
            if(letraTablaABC.equalsIgnoreCase(letraDeTexto)){
                String caracterEnCodigoMorse = tablaCodigoMorse[j];
                codigoTransformado += " " + caracterEnCodigoMorse;
            }
        }
        return codigoTransformado;
    }

    @GetMapping("/hacer-algo")
    public String primeraPrueba(){
        return "Hola mundo";
    }

    @GetMapping("/generar-password")
    public String getPassword(){
        double aleatorio = Math.random() * 1000000;
        long numeroAleatorio = Math.round(aleatorio);

        String password = "JDG" +  numeroAleatorio;
        return password;
    }
}
