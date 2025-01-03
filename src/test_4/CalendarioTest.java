package test_4;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class CalendarioTest {

    Calendario calendario = new Calendario();
    String data = "2023-03-01T13:00:00Z";

    @Test
    void anno() {
        assertEquals(2023, calendario.anno(data));
    }

    @Test
    void mese() {
        assertEquals(Month.MARCH, calendario.mese(data));
    }

    @Test
    void giorno() {
        assertEquals(1, calendario.giorno(data));
    }

    @Test
    void giornoSettimana() {
        assertEquals(DayOfWeek.WEDNESDAY, calendario.giornoSettimana(data));
    }
}