package roman.dominic.newsletters.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import roman.dominic.newsletters.models.Leads;
import roman.dominic.newsletters.repository.EmailRepository;
import roman.dominic.newsletters.validator.EmailValidator;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NewslettersController {

    @Autowired
    EmailRepository repositorioDeEmails;

    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Leads lead){
        String email = lead.getEmail();

        EmailValidator emailValidator = new EmailValidator();
        if(!emailValidator.esValido(email)){
            return "El email no es valido";
        }

        //Guardar el email en la BD
        repositorioDeEmails.guardarEmail(email);

        return "Email guardado: " + email;
    }

    @PostMapping("/api/newsletter/unsuscribe")
    public String eliminar(@RequestBody Leads lead){
        String email = lead.getEmail();

        //Eliminar el email en la BD
        repositorioDeEmails.eliminarEmail(email);

        return "Email eliminado: " + email;
    }

    @GetMapping("/api/newsletter")
    public List<Leads> getLeads(){
        List<Leads> leadsList = repositorioDeEmails.getAll();
        return leadsList;
    }
}
