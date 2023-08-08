package roman.dominic.newsletters.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import roman.dominic.newsletters.models.Propiedad;

@Repository
public interface IPropiedadRepository extends CrudRepository<Propiedad, Long> {
}
