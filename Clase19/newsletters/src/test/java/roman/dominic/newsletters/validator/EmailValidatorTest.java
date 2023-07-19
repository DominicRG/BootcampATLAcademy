package roman.dominic.newsletters.validator;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmailValidatorTest {

    @Test
    public void elEmailTieneQueTenerArroba(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("dsadadsdagfdgd");
        assertFalse(resultado);
    }

    @Test
    public void elEmailTieneQueTenerPunto(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("lucas@moy");
        assertFalse(resultado);
    }

    @Test
    public void queElArrobaNoSeaLaUltimaLetra(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("lucas.moy@");
        assertFalse(resultado);
    }

    @Test
    public void queNoTengaEspacios(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("lucas moy@atl.com");
        assertFalse(resultado);
    }

    @Test
    public void queNoTengaMasDe255Caracteres(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("fsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdffsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdf@atl.com");
        assertFalse(resultado);
    }
}
