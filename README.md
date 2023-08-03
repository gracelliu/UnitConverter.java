# Unit Converter Application
The Unit Converter Application is a Java program that provides a user-friendly interface to convert values between different units of time, length, and weight. The application is built using Java 8 and utilizes the Swing library for the graphical user interface.

</br> 

## Features
Convert time between seconds, minutes, hours, days, and years.
Convert length between meters, centimeters, kilometers, and feet.
Convert weight between kilograms, grams, and pounds.

</br>

## User Story
As a user who frequently deals with various units of time, length, and weight, I want a simple and efficient tool to perform conversions between different units. The Unit Converter Application should provide an intuitive and user-friendly interface, allowing me to quickly convert values without the need for manual calculations.

</br> 

## Design Patterns
Factory Method Pattern: The GUI panels for different unit converters (TimeConverterPanel, LengthConverterPanel, and WeightConverterPanel) use the Factory Method Pattern to create the converter instances. This pattern decouples the GUI components from the concrete converter classes, promoting extensibility.

Observer Pattern: The GUI components are event-driven, and the Observer Pattern is used to handle user interactions. When the "Convert" button is clicked, the corresponding converter panel acts as the subject, and the main application acts as the observer to receive and process the conversion results.
</br> 

## Version of Java and Testing Framework
Java version: Java 8
Testing Framework: JUnit

</br> 

## Code Smells and SOLID Compliance
The program aims to maintain code quality and adheres to SOLID principles. Design patterns like Factory Method promote a separation of concerns and modularity, reducing code smells and promoting maintainability. The classes are well-organized, and dependencies are managed effectively, ensuring a clean and maintainable codebase.

</br> 

## Remaining Improvements
The codebase is kept clean, and no significant code smells or violations of SOLID or Clean Architecture principles were identified during the development. The use of design patterns and modularity allows for easy extension of the converter application to support additional unit conversions or UI enhancements.

</br> 

Thank you for your interest in the Unit Converter Application! If you have any feedback or suggestions, please feel free to share them. Happy converting!
