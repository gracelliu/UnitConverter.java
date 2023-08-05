package main.java.interfaceadapters;

import main.java.usecases.Converter;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A JPanel that contains UI components for converting weight units
 */
public class WeightConverterPanel extends JPanel {
    private JTextField inputField;
    private JComboBox<String> fromUnitComboBox;
    private JComboBox<String> toUnitComboBox;
    private JLabel resultLabel;
    private JButton convertButton;
    private Converter weightConverter;

    /**
     * Create a new WeightConverterPanel
     * @param weightConverter The Converter to use for converting weight units
     */
    public WeightConverterPanel(Converter weightConverter) {
        this.weightConverter = weightConverter;

        // Initialize UI components
        inputField = new JTextField(10);
        fromUnitComboBox = new JComboBox<>(new String[]{"Kilograms", "Grams", "Pounds"});
        toUnitComboBox = new JComboBox<>(new String[]{"Kilograms", "Grams", "Pounds"});
        resultLabel = new JLabel("Result will be shown here");
        convertButton = new JButton("Convert");

        // Use the ConvertPanelHelper to layout UI components
        ConverterPanelHelper.layoutComponents(this, inputField, fromUnitComboBox,
                toUnitComboBox, convertButton, resultLabel);

        // Add action listener to the convertButton
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertUnits(weightConverter);
            }
        });
    }

    /**
     * Convert the input value from the fromUnit to the toUnit and display the result in the resultLabel.
     * @param converter The Converter to use for converting weight units
     */
    private void convertUnits(Converter converter) {
        try {
            double inputValue = Double.parseDouble(inputField.getText());
            String fromUnit = fromUnitComboBox.getSelectedItem().toString();
            String toUnit = toUnitComboBox.getSelectedItem().toString();

            double result = weightConverter.convert(inputValue, fromUnit, toUnit);

            resultLabel.setText(inputValue + " " + fromUnit + " = " + result + " " + toUnit);
        } catch (NumberFormatException ex) {
            // Handle invalid input
            resultLabel.setText("Invalid input");
        } catch (IllegalArgumentException ex) {
            // Handle unsupported conversion
            resultLabel.setText(ex.getMessage());
        }
    }

}