package roman.dominic.newsletters.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import roman.dominic.newsletters.models.Propiedad;
import roman.dominic.newsletters.services.PropiedadInterface;

import java.util.List;

@Repository
public class PropiedadRepository implements PropiedadInterface {

    @PersistenceContext
    EntityManager conexion;

    @Override
    public void agregar(Propiedad propiedad) {

    }

    @Override
    public void modificar(Propiedad propiedad) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Propiedad get(Long id) {
        String consultaSQL = "FROM Propiedad p WHERE p.id = :paramId";
        List<Propiedad> resutados = conexion.createQuery(consultaSQL).setParameter("paramId", id).getResultList();
        return resutados.get(0);
    }

    @Override
    public List<Propiedad> getAll() {
        return null;
    }
}
