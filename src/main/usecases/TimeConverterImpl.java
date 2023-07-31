package main.usecases;

import main.entities.TimeConverter;

/**
 * The TimeConverterImpl class provides an implementation of the Converter interface.
 * It uses the TimeConverter entity to convert time units between seconds, minutes, hours, days, and years.
 * This class abstracts the process of determining the original unit of the provided value.
 */
public class TimeConverterImpl implements Converter {
    private TimeConverter timeConverter = new TimeConverter();

    /**
     * Converts a given time from a specified unit to another unit.
     * The supported original units are "Seconds", "Minutes", "Hours", "Days", and "Years".
     *
     * @param value     the time value to be converted
     * @param fromUnit  the original unit of the value
     * @param toUnit    the unit to convert the value to
     * @return the converted time in the specified unit
     * @throws IllegalArgumentException if the original unit or the target unit is not supported
     */
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        if (fromUnit.equals("Seconds")) {
            return timeConverter.convertFromSeconds(value, toUnit);
        } else if (fromUnit.equals("Minutes")) {
            return timeConverter.convertFromMinutes(value, toUnit);
        } else if (fromUnit.equals("Hours")) {
            return timeConverter.convertFromHours(value, toUnit);
        } else if (fromUnit.equals("Days")) {
            return timeConverter.convertFromDays(value, toUnit);
        } else if (fromUnit.equals("Years")) {
            return timeConverter.convertFromYears(value, toUnit);
        } else {
            throw new IllegalArgumentException("Unsupported conversion from unit: " + fromUnit);
        }
    }

}