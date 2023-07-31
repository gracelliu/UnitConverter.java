package test;

import main.entities.TimeConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimeConverterTest {

    @Test
    public void testConvertFromSecondsToMinutes() {
        TimeConverter timeConverter = new TimeConverter();
        double result = timeConverter.convertFromSeconds(120, "Minutes");
        assertEquals(2, result, 0.001); // 120 seconds = 2 minutes
    }

    @Test
    public void testConvertFromMinutesToHours() {
        TimeConverter timeConverter = new TimeConverter();
        double result = timeConverter.convertFromMinutes(120, "Hours");
        assertEquals(2, result, 0.001); // 120 minutes = 2 hours
    }

    @Test
    public void testConvertFromSecondsToHours() {
        TimeConverter timeConverter = new TimeConverter();
        double result = timeConverter.convertFromSeconds(3600, "Hours");
        assertEquals(1, result, 0.001); // 3600 seconds = 1 hour
    }

    @Test
    public void testUnsupportedConversion() {
        TimeConverter timeConverter = new TimeConverter();
        assertThrows(IllegalArgumentException.class, () -> {
            timeConverter.convertFromHours(24, "InvalidUnit");
        });
    }

}