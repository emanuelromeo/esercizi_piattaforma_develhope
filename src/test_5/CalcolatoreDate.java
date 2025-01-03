package test_5;

import java.time.OffsetDateTime;

public class CalcolatoreDate {

    public OffsetDateTime calcolaData(String data) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        return offsetDateTime.plusYears(1).minusMonths(1).plusDays(7);
    }

}
