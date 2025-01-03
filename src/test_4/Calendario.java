package test_4;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Calendario {

    public int anno(String data) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        return offsetDateTime.getYear();
    }

    public Month mese(String data) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        return offsetDateTime.getMonth();
    }

    public int giorno(String data) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        return offsetDateTime.getDayOfMonth();
    }

    public DayOfWeek giornoSettimana(String data) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        return offsetDateTime.getDayOfWeek();
    }

}
