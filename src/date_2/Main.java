package date_2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        String formattedData = data.format(formatter);

        System.out.println(formattedData);

    }


}
