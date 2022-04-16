package CovidPatientChallenge;

public class Main {

    public static void main(String[] args) {

        PatientData patientData = new PatientData();

        Patient patient1 = new Patient(
                patientData.getName(0),
                patientData.getAge(0),
                Double.parseDouble(patientData.getTemperature(0)));

        CovidPatient patient2 = new CovidPatient(
                patientData.getName(1),
                patientData.getAge(1),
                Double.parseDouble(patientData.getTemperature(1)), true);

        LabPatient patient3 = new LabPatient(
                patientData.getAge(2), Double.parseDouble(patientData.getTemperature(2)), "L01");

    }

}
