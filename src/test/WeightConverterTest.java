package test;

import main.entities.WeightConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WeightConverterTest {

    @Test
    public void testConvertFromKilogramsToGrams() {
        WeightConverter weightConverter = new WeightConverter();
        double result = weightConverter.convertFromKilograms(2.5, "Grams");
        assertEquals(2500, result, 0.001); // 2.5 kilograms = 2500 grams
    }

    @Test
    public void testConvertFromGramsToPounds() {
        WeightConverter weightConverter = new WeightConverter();
        double result = weightConverter.convertFromGrams(1000, "Pounds");
        assertEquals(2.20462, result, 0.001); // 1000 grams = 2.20462 pounds
    }

    @Test
    public void testConvertFromPoundsToKilograms() {
        WeightConverter weightConverter = new WeightConverter();
        double result = weightConverter.convertFromPounds(0, "Kilograms");
        assertEquals(0, result, 0.001); // 0 pounds = 0 kilograms
    }

    @Test
    public void testUnsupportedConversion() {
        WeightConverter weightConverter = new WeightConverter();
        assertThrows(IllegalArgumentException.class, () -> {
            weightConverter.convertFromPounds(5, "InvalidUnit");
        });
    }

}