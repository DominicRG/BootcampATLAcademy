package academy.atl.refactorizacion;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class JuegoAhorcadoTest {

    // Atributos (caracteristicas)
    JuegoAhorcado juegoAhorcado;

    @Before
    public void init() {
        juegoAhorcado = new JuegoAhorcado();
        juegoAhorcado.setPalabraSecreta("CASA");
    }

    @Test
    public void verificarLetra() {
        juegoAhorcado.verificarLetra('C');
        assertEquals("C___",juegoAhorcado.verificarLetra('C'));
    }

    @Test
    public void verificarOcultarPalabra() {
        String adivinarLaPabra = JuegoAhorcado.ocultarPalabra(juegoAhorcado.getPalabraSecreta());
        assertEquals(juegoAhorcado.getPalabraSecreta().length(), adivinarLaPabra.length());
    }

    @Test
    public void verificarPalabra() {
        juegoAhorcado.setPalabraAdivinada("CASA");
        assertEquals(true, juegoAhorcado.seAdivinoLaPalabra());
    }
    @Test
    public void verificarListadoDePalabras() {
        List<String> palabra = Arrays.asList(
                "PILETA",
                "SILLA",
                "",
                " ",
                "PUERTA"
        );
        assertFalse(juegoAhorcado.setListaDePalabras(palabra));
    }

    @Test
    public void verificarIntentosDisponibles() {
        assertFalse(juegoAhorcado.setIntentosDisponibles(8));
    }

    @Mock
    private PaypalConnection paypalConnection;

    @Test
    public void probarPagosConPaypal() {
        doNothing().when(paypalConnection).pagar(any());

        PagosService pagosService = new PagosService(paypalConnection);
        pagosService.pagar(100, "Paypal");

        verify(paypalConnection, times(1)).pagar(100);
    }

}
