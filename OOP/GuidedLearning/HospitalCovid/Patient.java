import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Patient extends VitalSign {
    private String name;
    private int age;
    private String bodyTemperature;
    final static double KelvinToCelcius = 273.15;

    public Patient(String name, int age, double bodyTemperature) {
        this.name = name;
        this.age = age;
        this.bodyTemperature = this.getBodyTemperature(bodyTemperature);

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Temperature is " + bodyTemperature);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBodyTemperature(double kelvin) {
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(kelvin - KelvinToCelcius);
    }

}