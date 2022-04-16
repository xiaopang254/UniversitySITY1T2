package CovidPatientChallenge;

import java.math.*;
import java.text.*;

public class Patient extends VitalSigns {
    private String name;
    private int age;
    private double temperature;

    final static double KelvinToCelsius = 273.15;

    // Just an empty constructor
    public Patient() {

    }

    public Patient(String name, int age, double temperature) {
        this.name = name;
        this.age = age;
        this.temperature = temperature;

        System.out.println("Patient Name: " + name + "\nPatient Age: " + age + "\nTemperature: "
                + this.getBodyTemperature(temperature) + "\n");

    }

    public String getBodyTemperature(double kelvin) {

        double v = this.convertK2C(kelvin);
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(v);
    }

    private double convertK2C(double kelvin) {
        return kelvin - KelvinToCelsius;
    }

}
