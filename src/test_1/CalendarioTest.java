package test_1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;

class CalendarioTest {

    Calendario calendario = new Calendario();

    @Test
    void giornoDellaSettimana() {
        String date = "2025-01-03T21:18:01+02:00";
        assertEquals(DayOfWeek.FRIDAY, calendario.giornoDellaSettimana(date));
    }
}