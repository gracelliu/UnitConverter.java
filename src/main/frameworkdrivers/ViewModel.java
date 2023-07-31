package main.frameworkdrivers;

import main.usecases.Converter;
import javax.swing.*;

/**
 * The ViewModel class represents a ViewModel in the Model-View-ViewModel (MVVM) pattern.
 * It associates a JPanel (representing a view) with a Converter (representing a model).
 * This ViewModel class can be used to manage and manipulate data for a view.
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