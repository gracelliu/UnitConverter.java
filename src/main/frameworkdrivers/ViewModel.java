package main.frameworkdrivers;

import main.usecases.Converter;
import javax.swing.*;

/**
 * The ViewModel class represents a ViewModel in the Model-View-ViewModel (MVVM) pattern.
 */
public class ViewModel {
    private JPanel panel;
    private Converter converter;

    public ViewModel(JPanel panel, Converter converter) {
        this.panel = panel;
        this.converter = converter;
    }

    public JPanel getPanel() {
        return panel;
    }

    public Converter getConverter() {
        return converter;
    }
}