package test.java;

import main.java.entities.LengthConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LengthConverterTest {

    @Test
    public void testConvertFromMetersToCentimeters() {
        LengthConverter lengthConverter = new LengthConverter();
        double result = lengthConverter.convertFromMeters(2.5, "Centimeters");
        assertEquals(250, result, 0.001); // 2.5 meters = 250 centimeters
    }

    @Test
    public void testConvertFromCentimetersToFeet() {
        LengthConverter lengthConverter = new LengthConverter();
        double result = lengthConverter.convertFromCentimeters(500, "Feet");
        assertEquals(16.4042, result, 0.001); // 500 centimeters = 16.4042 feet
    }

    @Test
    public void testConvertFromMetersToFeet() {
        LengthConverter lengthConverter = new LengthConverter();
        double result = lengthConverter.convertFromMeters(0, "Feet");
        assertEquals(0, result, 0.001); // 0 meters = 0 feet
    }

    @Test
    public void testUnsupportedConversion() {
        LengthConverter lengthConverter = new LengthConverter();
        assertThrows(IllegalArgumentException.class, () -> {
            lengthConverter.convertFromKilometers(5, "InvalidUnit");
        });
    }
}
