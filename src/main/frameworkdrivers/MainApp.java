package main.frameworkdrivers;

import main.interfaceadapters.*;
import main.usecases.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The MainApp class is the entry point of the application.
 * It sets up the GUI and handles the selection of different converter types through an ActionListener.
 *
 * The main method uses SwingUtilities.invokeLater to ensure that the GUI creation is done on the
 * Event Dispatch Thread, as is required by Swing.
 */
public class MainApp {
    private static final String[] CONVERSION_TYPES = {"Time", "Weight", "Length"};

    /**
     * Main method to launch the application.
     * Sets up converters for time, weight, and length and the associated ViewModels.
     * Also sets up the main application window, including a combo box for conversion type selection
     * and an 'Open' button to display the selected converter.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create instances of the converter implementations
                Converter weightConverter = new WeightConverterImpl();
                Converter lengthConverter = new LengthConverterImpl();
                Converter timeConverter = new TimeConverterImpl();

                // Create ViewModels for each conversion type
                ViewModel weightViewModel = new ViewModel(new WeightConverterPanel(weightConverter), weightConverter);
                ViewModel lengthViewModel = new ViewModel(new LengthConverterPanel(lengthConverter), lengthConverter);
                ViewModel timeViewModel = new ViewModel(new TimeConverterPanel(timeConverter), timeConverter);

                // Create and show the main application window with the conversion type selection
                JFrame frame = new JFrame("Unit Converter App");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JComboBox<String> conversionTypeComboBox = new JComboBox<>(CONVERSION_TYPES);
                JButton openButton = new JButton("Open");

                // Add action listener to the openButton
                openButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String selectedConversionType = conversionTypeComboBox.getSelectedItem().toString();

                        ViewModel viewModel = null;

                        // Determine the selected ViewModel based on the conversion type
                        if (selectedConversionType.equals("Weight")) {
                            viewModel = weightViewModel;
                        } else if (selectedConversionType.equals("Length")) {
                            viewModel = lengthViewModel;
                        } else if (selectedConversionType.equals("Time")) {
                            viewModel = timeViewModel;
                        }

                        // Display the selected ViewModel's panel
                        if (viewModel != null) {
                            frame.getContentPane().removeAll();
                            frame.getContentPane().add(viewModel.getPanel(), BorderLayout.CENTER);
                            frame.pack();
                            frame.revalidate();
                            frame.repaint();
                        }
                    }
                });

                JPanel selectionPanel = new JPanel();
                selectionPanel.add(conversionTypeComboBox);
                selectionPanel.add(openButton);
                frame.add(selectionPanel, BorderLayout.NORTH);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}