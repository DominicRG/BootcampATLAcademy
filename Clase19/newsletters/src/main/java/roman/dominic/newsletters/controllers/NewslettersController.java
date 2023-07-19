package roman.dominic.newsletters.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import roman.dominic.newsletters.models.Lead;
import roman.dominic.newsletters.validator.EmailValidator;

@RestController
public class NewslettersController {

    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Lead lead){

        EmailValidator emailValidator = new EmailValidator();
        if(!emailValidator.esValido(lead.getEmail())){
            return "El email no es valido";
        }

        return "Email: " + lead.getEmail();
    }
}
