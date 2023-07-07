package roman.dominic.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
public class BusquedaController {

    @GetMapping("/busqueda-usuario/{busqueda}")
    public List<String> obtenerPalabrasAutocompletar(@PathVariable String busqueda) {

        //Logica de busqueda
        String[] frasesTipicasDeBusqueda = {"bootcamp de JAVA" , "bootcamp de python", "curso de nodeJS", "Curso de C",
                "bootcamp de Java Avanzado"};

//        String[] resultadoDeLaBusqueda = new String[10];
//        int cont = 0;

        List<String> resultadoDeLaBusqueda = new ArrayList();

        for(String frase : frasesTipicasDeBusqueda){
            if(frase.toLowerCase().contains(busqueda.toLowerCase())){
//                resultadoDeLaBusqueda[cont] = frase;
//                cont++;
                resultadoDeLaBusqueda.add(frase);
            }
        }

        return resultadoDeLaBusqueda;
    }
}
