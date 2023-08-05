package main.java.interfaceadapters;
import javax.swing.*;
import java.awt.*;

/** This class provides a helper method to layout UI components in a JPanel. */
public class ConverterPanelHelper {

    public static void layoutComponents(JPanel panel, JTextField inputField, JComboBox<String> fromUnitComboBox,
                                        JComboBox<String> toUnitComboBox, JButton convertButton, JLabel resultLabel) {
        // Set high contrast color scheme
        Color backgroundColor = Color.WHITE;
        Color foregroundColor = Color.BLACK;

        inputField.setBackground(Color.LIGHT_GRAY);
        fromUnitComboBox.setBackground(Color.PINK);
        toUnitComboBox.setBackground(Color.PINK);
        convertButton.setBackground(Color.PINK);
        resultLabel.setBackground(Color.PINK);

        panel.setBackground(backgroundColor);
        inputField.setForeground(foregroundColor);
        fromUnitComboBox.setForeground(foregroundColor);
        toUnitComboBox.setForeground(foregroundColor);
        convertButton.setForeground(foregroundColor);
        resultLabel.setForeground(foregroundColor);

        // Layout UI components
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Value:"));
        panel.add(inputField);
        panel.add(fromUnitComboBox);
        panel.add(new JLabel("to"));
        panel.add(toUnitComboBox);
        panel.add(convertButton);
        panel.add(resultLabel);
    }

}