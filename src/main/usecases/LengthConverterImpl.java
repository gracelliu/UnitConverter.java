package main.usecases;

import main.entities.LengthConverter;

/**
 * The LengthConverterImpl class provides an implementation of the Converter interface.
 * It uses the LengthConverter entity to convert length units between meters, centimeters, kilometers, and feet.
 * This class abstracts the process of determining the original unit of the provided value.
 */
public class LengthConverterImpl implements Converter {
    private LengthConverter lengthConverter = new LengthConverter();

    /**
     * Converts a given length from a specified unit to another unit.
     * The supported original units are "Meters", "Centimeters", "Kilometers", and "Feet".
     *
     * @param value     the length value to be converted
     * @param fromUnit  the original unit of the value
     * @param toUnit    the unit to convert the value to
     * @return the converted length in the specified unit
     * @throws IllegalArgumentException if the original unit or the target unit is not supported
     */
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        if (fromUnit.equals("Meters")) {
            return lengthConverter.convertFromMeters(value, toUnit);
        } else if (fromUnit.equals("Centimeters")) {
            return lengthConverter.convertFromCentimeters(value, toUnit);
        } else if (fromUnit.equals("Kilometers")) {
            return lengthConverter.convertFromKilometers(value, toUnit);
        } else if (fromUnit.equals("Feet")) {
            return lengthConverter.convertFromFeet(value, toUnit);
        } else {
            throw new IllegalArgumentException("Unsupported conversion from unit: " + fromUnit);
        }
    }

}