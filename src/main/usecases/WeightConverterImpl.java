package main.usecases;

import main.entities.WeightConverter;

/**
 * The WeightConverterImpl class provides an implementation of the Converter interface.
 */
public class WeightConverterImpl implements Converter {
    private WeightConverter weightConverter = new WeightConverter();

    /**
     * Converts a given weight from a specified unit to another unit.
     * The supported original units are "Kilograms", "Grams", and "Pounds".
     *
     * @param value     the weight value to be converted
     * @param fromUnit  the original unit of the value
     * @param toUnit    the unit to convert the value to
     * @return the converted weight in the specified unit
     * @throws IllegalArgumentException if the original unit or the target unit is not supported
     */
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        if (fromUnit.equals("Kilograms")) {
            return weightConverter.convertFromKilograms(value, toUnit);
        } else if (fromUnit.equals("Grams")) {
            return weightConverter.convertFromGrams(value, toUnit);
        } else if (fromUnit.equals("Pounds")) {
            return weightConverter.convertFromPounds(value, toUnit);
        } else {
            throw new IllegalArgumentException("Unsupported conversion from unit: " + fromUnit);
        }
    }

}