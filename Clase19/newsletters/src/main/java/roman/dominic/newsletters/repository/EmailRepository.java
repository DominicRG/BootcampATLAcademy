package roman.dominic.newsletters.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import roman.dominic.newsletters.models.Leads;

import java.util.List;

@Repository
public class EmailRepository {

    @PersistenceContext
    private EntityManager baseDeDatos;

    @Transactional
    public void guardarEmail(String emailDelUsuario){
        String consultaSQL = "INSERT INTO Leads (email) VALUES (:paramEmail)";
        baseDeDatos.createQuery(consultaSQL).setParameter("paramEmail", emailDelUsuario).executeUpdate();
    }

    @Transactional
    public void eliminarEmail(String emailDelUsuario) {
        String consultaSQL = "DELETE FROM Leads WHERE email = :paramEmail";
        baseDeDatos.createQuery(consultaSQL).setParameter("paramEmail", emailDelUsuario).executeUpdate();
    }

    @Transactional
    public List<Leads> getAll(){
        String sql = "SELECT e from Leads e";
        return baseDeDatos.createQuery(sql, Leads.class).getResultList();
    }
}
