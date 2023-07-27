package roman.dominic.newsletters.controllers;

import org.springframework.web.bind.annotation.*;
import roman.dominic.newsletters.models.Vendedor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class VendedorController {

    @PostMapping("/api/vendedor")
    public void agregar(@RequestBody Vendedor vendedor){
        //funcionalidad para agregar a la BD
    }

    @PutMapping("/api/vendedor/{id}")
    public void modificar(@RequestBody Vendedor vendedor, @PathVariable("id") Long id){
        //funcionalidad para modificar en la BD
    }

    @DeleteMapping("/api/vendedor/{id}")
    public void eliminar(@PathVariable("id") Long id){
        //funcionalidad para eliminar en la BD
    }

    @GetMapping("/api/vendedor/{id}")
    public Vendedor get(@PathVariable("id") Long id){
        Vendedor vendedor = new Vendedor();
        vendedor.setId(1L);
        vendedor.setNombre("Lucas");
        vendedor.setApellido("Moy");
        vendedor.setEmail("sadsadsad@gmail.com");
        vendedor.setFechaCreacion(LocalDate.now());
        return vendedor;
    }

    @GetMapping("/api/vendedor")
    public List<Vendedor> getAll(){
        List<Vendedor> list = new ArrayList<>();

        Vendedor vendedor = new Vendedor();
        vendedor.setId(1L);
        vendedor.setNombre("Lucas");
        vendedor.setApellido("Moy");
        vendedor.setEmail("sadsadsad@gmail.com");
        vendedor.setFechaCreacion(LocalDate.now());

        Vendedor vendedor2 = new Vendedor();
        vendedor2.setId(2L);
        vendedor2.setNombre("Sabrina");
        vendedor2.setApellido("Rizo");
        vendedor2.setEmail("sadsadsad@gmail.com");
        vendedor2.setFechaCreacion(LocalDate.now());

        list.add(vendedor);
        list.add(vendedor2);
        return list;
    }

}
