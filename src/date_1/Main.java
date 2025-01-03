package date_1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        String fullData = data.format(fullFormatter);
        String mediumData = data.format(mediumFormatter);
        String shortData = data.format(shortFormatter);

        System.out.println(fullData);
        System.out.println(mediumData);
        System.out.println(shortData);

    }


}
