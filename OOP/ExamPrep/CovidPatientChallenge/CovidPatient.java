package CovidPatientChallenge;

public class CovidPatient extends Patient {

    private boolean covidTest;

    public CovidPatient(String name, int age, double temperature, boolean covidTest) {
        super(name, age, temperature);
        this.covidTest = covidTest;

    }
}
