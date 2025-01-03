package test_5;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CalcolatoreDateTest {

    CalcolatoreDate calcolatoreDate = new CalcolatoreDate();
    String data = "2023-03-01T13:00:00Z";

    @Test
    void calcolaData() {
        assertEquals(OffsetDateTime.parse("2024-02-08T13:00Z"), calcolatoreDate.calcolaData(data));
    }
}