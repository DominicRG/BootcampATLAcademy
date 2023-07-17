package roman.dominic.trivia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import roman.dominic.trivia.entities.Category;
import roman.dominic.trivia.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/busqueda-{id}")
    public Category buscarPorId(@PathVariable Long id) {
        return categoryRepository.findById(id);
    }

    @GetMapping("/question/{categoria}")
    public Category getQuestion(@PathVariable String categoria){

        List<Category> resultado = new ArrayList<>();
        Category ejemplo = categoryRepository.findById(1L);
        resultado.add(ejemplo);

        return ejemplo;
        //ObjectMapper convertidor = new ObjectMapper();
        //Pregunta preg = convertidor.convertValue(respuestaJson, Pregunta.class);
        //return preg;
    }

    @GetMapping("/categories")
    public Category[] getCategories(){

        Category cat = new Category();
        cat.setName("Arte");
        cat.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Category cat2 = new Category();
        cat2.setName("Deportes");
        cat2.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Category[] categorias = new Category[2];
        categorias[0] = cat;
        categorias[1] = cat2;

        return categorias;

        /*return "[\n" +
                "  {\n" +
                "    \"category\": \"Cultura\",\n" +
                "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Deportes\",\n" +
                "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Arte\",\n" +
                "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Cine\",\n" +
                "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Historia\",\n" +
                "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Ciencia\",\n" +
                "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                "  }\n" +
                "]";*/
    }
}
