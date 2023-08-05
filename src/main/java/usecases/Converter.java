package main.java.usecases;

/**
 * The Converter interface provides a contract for converting values between different units.
 */
public interface Converter {
    double convert(double value, String fromUnit, String toUnit);

}