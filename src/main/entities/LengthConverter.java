package main.entities;

/**
 * The LengthConverter class provides methods to convert lengths between different units.
 */
public class LengthConverter {

    /**
     * Converts a given length from meters to the specified unit.
     *
     * @param value the length in meters
     * @param toUnit the unit to convert to
     * @return the converted length in the specified unit
     * @throws IllegalArgumentException if the specified unit is not supported
     */
    public double convertFromMeters(double value, String toUnit) {
        switch (toUnit) {
            case "Meters":
                return value;
            case "Centimeters":
                return value * 100;
            case "Kilometers":
                return value / 1000;
            case "Feet":
                return value * 3.28084;
            // Add more cases as needed for other units
            default:
                throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

    /**
     * Converts a given length from centimeters to the specified unit.
     *
     * @param value the length in centimeters
     * @param toUnit the unit to convert to
     * @return the converted length in the specified unit
     * @throws IllegalArgumentException if the specified unit is not supported
     */
    public double convertFromCentimeters(double value, String toUnit) {
        switch (toUnit) {
            case "Meters":
                return value / 100;
            case "Centimeters":
                return value;
            case "Kilometers":
                return value / 100000;
            case "Feet":
                return value * 0.0328084;
            // Add more cases as needed for other units
            default:
                throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

    /**
     * Converts a given length from kilometers to the specified unit.
     *
     * @param value the length in kilometers
     * @param toUnit the unit to convert to
     * @return the converted length in the specified unit
     * @throws IllegalArgumentException if the specified unit is not supported
     */
    public double convertFromKilometers(double value, String toUnit) {
        switch (toUnit) {
            case "Meters":
                return value * 1000;
            case "Centimeters":
                return value * 100000;
            case "Kilometers":
                return value;
            case "Feet":
                return value * 3280.84;

            default:
                throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

    /**
     * Converts a given length from feet to the specified unit.
     *
     * @param value the length in feet
     * @param toUnit the unit to convert to
     * @return the converted length in the specified unit
     * @throws IllegalArgumentException if the specified unit is not supported
     */
    public double convertFromFeet(double value, String toUnit) {
        switch (toUnit) {
            case "Meters":
                return value * 0.3048;
            case "Centimeters":
                return value * 30.48;
            case "Kilometers":
                return value * 0.0003048;
            case "Feet":
                return value;

            default:
                throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

}