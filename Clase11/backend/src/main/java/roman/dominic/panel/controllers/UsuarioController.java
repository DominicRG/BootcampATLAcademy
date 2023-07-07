package roman.dominic.panel.controllers;

import org.springframework.web.bind.annotation.*;
import roman.dominic.panel.models.Usuario;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    List<Usuario> usuarios = new ArrayList<>();
    //Usuario user = new Usuario(1, "Dominic", "Roman", "123456789", "romandominci30@gmail.com");

    @GetMapping("/api/usuarios")
    public List<Usuario> listarUsuarios(){
        return usuarios;
    }

    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuario(@PathVariable String id){

        Usuario delete = null;

        for (Usuario user : usuarios) {
            if(id.equals(user.getId().toString())){
                delete = user;
            }
        }

        usuarios.remove(delete);
//        Usuario usuarioEncontrado = usuarios.stream().filter(user -> user.getId().equals(id)).findFirst().get();
//        usuarios.remove(usuarioEncontrado);
    }

    @PostMapping("/api/usuarios")
    public void agregarUsuario(@RequestBody Usuario user){
        usuarios.add(user);
    }

}
