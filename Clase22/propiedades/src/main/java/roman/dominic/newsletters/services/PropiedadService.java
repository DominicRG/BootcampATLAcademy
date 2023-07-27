package roman.dominic.newsletters.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import roman.dominic.newsletters.models.Propiedad;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropiedadService implements PropiedadInterface{

    public void agregar(Propiedad propiedad){
        if(propiedad.getTitulo().equals("")){
            return;
        }

        //Llamar a la base de datos
    }

    public void modificar(Propiedad propiedad, Long id){
        //funcionalidad para modificar en la BD
    }

    public void eliminar(Long id){
        //funcionalidad para eliminar en la BD
    }

    public Propiedad get(Long id){
        return null;
    }

    public List<Propiedad> getAll(){
        return null;
    }
}
