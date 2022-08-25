public class InPatient extends Patient {

    private boolean covidTestDone;

    public InPatient(String name, int age, float bodyTemperature, boolean covidTestDone) {
        super(name, age, bodyTemperature);
        this.covidTestDone = covidTestDone;
        System.out.println("Last COVID-19 Test: " + covidTestDone);
    }
}
