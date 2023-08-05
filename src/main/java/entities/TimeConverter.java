package main.java.entities;

/** The TimeConverter class provides methods for converting time between different units. */
public class TimeConverter {

    /**
     * Converts a given time from seconds to the specified unit.
     */
    public double convertFromSeconds(double value, String toUnit) {
        switch (toUnit) {
            case "Seconds": return value;
            case "Minutes": return value / 60;
            case "Hours": return value / 3600;
            case "Days": return value / (3600 * 24);
            case "Years": return value / (3600 * 24 * 365);
            default: throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

    /**
     * Converts a given time from minutes to the specified unit.
     */
    public double convertFromMinutes(double value, String toUnit) {
        switch (toUnit) {
            case "Seconds": return value * 60;
            case "Minutes": return value;
            case "Hours": return value / 60;
            case "Days": return value / (60 * 24);
            case "Years": return value / (60 * 24 * 365);
            default: throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

    /**
     * Converts a given time from hours to the specified unit.
     */
    public double convertFromHours(double value, String toUnit) {
        switch (toUnit) {
            case "Seconds": return value * 3600;
            case "Minutes": return value * 60;
            case "Hours": return value;
            case "Days": return value / 24;
            case "Years": return value / (24 * 365);
            default: throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

    /**
     * Converts a given time from days to the specified unit.
    */
    public double convertFromDays(double value, String toUnit) {
        switch (toUnit) {
            case "Seconds": return value * 3600 * 24;
            case "Minutes": return value * 60 * 24;
            case "Hours": return value * 24;
            case "Days": return value;
            case "Years": return value / 365;
            default: throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

    /**
     * Converts a given time from years to the specified unit.
     */
    public double convertFromYears(double value, String toUnit) {
        switch (toUnit) {
            case "Seconds": return value * 3600 * 24 * 365;
            case "Minutes": return value * 60 * 24 * 365;
            case "Hours": return value * 24 * 365;
            case "Days": return value * 365;
            case "Years": return value;
            default: throw new IllegalArgumentException("Unsupported conversion to unit: " + toUnit);
        }
    }

}