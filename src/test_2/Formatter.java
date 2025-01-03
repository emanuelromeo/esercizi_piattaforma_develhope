package test_2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatter {

    public String formatDate(String date, FormatStyle style) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(style);
        return offsetDateTime.format(formatter);
    }

}
