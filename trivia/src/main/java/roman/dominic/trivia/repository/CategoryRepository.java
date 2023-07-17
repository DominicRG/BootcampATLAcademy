package roman.dominic.trivia.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import roman.dominic.trivia.entities.Category;

@Repository
@Transactional
public class CategoryRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Category findById(Long id){
        return entityManager.find(Category.class, id);
    }

    /*public void List<Category> getAll(){
        entityManager.find
    }*/
}
