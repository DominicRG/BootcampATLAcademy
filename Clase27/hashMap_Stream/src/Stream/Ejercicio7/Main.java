package Stream.Ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> localDateList = new ArrayList<>();
        localDateList.add(LocalDate.parse("2010-12-01"));
        localDateList.add(LocalDate.parse("1978-12-01"));
        localDateList.add(LocalDate.parse("2000-12-01"));
        localDateList.add(LocalDate.parse("2001-12-01"));

        List<Integer> annos = localDateList.stream().map(e -> e.getYear()).toList();
        System.out.println(annos);
    }
}
