package roman.dominic.newsletters.services;

import roman.dominic.newsletters.models.Propiedad;

import java.util.List;

public interface PropiedadInterface {

    public void agregar(Propiedad propiedad);
    public void modificar(Propiedad propiedad, Long id);
    public void eliminar(Long id);
    public Propiedad get(Long id);
    public List<Propiedad> getAll();
}
