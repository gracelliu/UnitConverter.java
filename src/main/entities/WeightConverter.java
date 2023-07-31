package main.entities;

/**
 * The WeightConverter class provides methods for converting weight between different units.
 */
public class WeightConverter {

    /**
     * Converts a given weight from kilograms to the specified unit.
     *
     * @param value the weight in kilograms
     * @param toUnit the unit to convert to
     * @return the converted weight in the specified unit
     * @throws IllegalArgumentException if the specified unit is not supported
     */
    public double convertFromKilograms(double value, String toUnit) {
        switch (toUnit) {
            case "Kilograms":
                return value;
            case "Grams":
                return value * 1000;
            case "Pounds":
                return value * 2.20462;
            default:
                throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

    /**
     * Converts a given weight from grams to the specified unit.
     *
     * @param value the weight in grams
     * @param toUnit the unit to convert to
     * @return the converted weight in the specified unit
     * @throws IllegalArgumentException if the specified unit is not supported
     */
    public double convertFromGrams(double value, String toUnit) {
        switch (toUnit) {
            case "Kilograms":
                return value / 1000;
            case "Grams":
                return value;
            case "Pounds":
                return value * 0.00220462;
            default:
                throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

    /**
     * Converts a given weight from pounds to the specified unit.
     *
     * @param value the weight in pounds
     * @param toUnit the unit to convert to
     * @return the converted weight in the specified unit
     * @throws IllegalArgumentException if the specified unit is not supported
     */
    public double convertFromPounds(double value, String toUnit) {
        switch (toUnit) {
            case "Kilograms":
                return value * 0.453592;
            case "Grams":
                return value * 453.592;
            case "Pounds":
                return value;

            default:
                throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

}