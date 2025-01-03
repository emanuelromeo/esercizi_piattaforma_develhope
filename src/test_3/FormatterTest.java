package test_3;

import org.junit.jupiter.api.Test;

import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatterTest {

    Formatter formatter = new Formatter();

    @Test
    void formatDate() {
        assertEquals("01 marzo 2002", formatter.formatDate("2002-03-01T13:00:00Z"));
    }

}