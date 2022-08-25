public class OutPatient extends Patient {
    private String labCode;

    public OutPatient(String name, int age, float bodyTemperature, String labCode) {
        super(null, age, bodyTemperature);
        String procedure = null;
        switch (labCode) {
            case "L01":
                procedure = "Blood Test";
                break;
            case "L02":
                procedure = "Liver Test";
                break;
            default:
                procedure = "Unknown Test";

        }
        System.out.println("Lab Test: " + procedure);
    }
}
