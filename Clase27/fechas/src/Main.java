import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println(fechaHora);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = fechaHora.format(formatter);
        System.out.println(fechaFormateada);
    }
}
