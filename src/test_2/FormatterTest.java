package test_2;

import org.junit.jupiter.api.Test;

import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class FormatterTest {

    Formatter formatter = new Formatter();

    @Test
    void formatDate_full() {
        assertEquals("venerdì 1 marzo 2002", formatter.formatDate("2002-03-01T13:00:00Z", FormatStyle.FULL));
    }

    @Test
    void formatDate_medium() {
        assertEquals("1 mar 2002", formatter.formatDate("2002-03-01T13:00:00Z", FormatStyle.MEDIUM));
    }

    @Test
    void formatDate_short() {
        assertEquals("01/03/02", formatter.formatDate("2002-03-01T13:00:00Z", FormatStyle.SHORT));
    }
}