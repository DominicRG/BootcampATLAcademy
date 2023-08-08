package roman.dominic.newsletters.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import roman.dominic.newsletters.models.Propiedad;
import roman.dominic.newsletters.repository.IPropiedadRepository;
import roman.dominic.newsletters.repository.PropiedadRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropiedadService implements PropiedadInterface{
    @Autowired
    IPropiedadRepository propiedadRepository;

    public void agregar(Propiedad propiedad){
        propiedadRepository.save(propiedad);
    }

    public void modificar(Propiedad propiedad){
        //funcionalidad para modificar en la BD
        propiedadRepository.save(propiedad);
    }

    public void eliminar(Long id){
        //funcionalidad para eliminar en la BD
        propiedadRepository.deleteById(id);
    }

    public Propiedad get(Long id){
        return propiedadRepository.findById(id).get();
    }

    public List<Propiedad> getAll(){
        return (List) propiedadRepository.findAll();
    }
}
