package CovidPatientChallenge;

public class LabPatient extends Patient {

    private String labCode;
    private String procedure;

    public LabPatient(int age, double temperature, String labCode) {

        super(null, age, temperature);
        this.labCode = labCode;

        switch (labCode) {
            case "L01":
                procedure = "Blood Test";
                break;
            case "L02":
                procedure = "Liver Test";
                break;

            default:
                procedure = "Unknown";
        }

    }

}
