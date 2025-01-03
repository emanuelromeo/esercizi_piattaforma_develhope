package test_1;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

public class Calendario {

    public DayOfWeek giornoDellaSettimana(String data) {
        try {
            OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
            return offsetDateTime.getDayOfWeek();
        } catch (DateTimeParseException e) {
            return DayOfWeek.MONDAY;
        }
    }

}
