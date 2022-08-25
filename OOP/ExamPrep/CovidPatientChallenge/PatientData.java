package CovidPatientChallenge;

public class PatientData {

    private String[] name = { "Saitama", "RobotDude", "King" };
    private int[] age = { 20, 16, 30 };
    private String[] temperature = { "310.5", "311.65", "312.95" };

    public String getName(int index) {
        return name[index];
    }

    public int getAge(int index) {
        return age[index];
    }

    public String getTemperature(int index) {
        return temperature[index];
    }
}
