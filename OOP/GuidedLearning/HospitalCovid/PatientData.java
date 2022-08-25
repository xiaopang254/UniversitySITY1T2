public class PatientData {

    private String[] name = { "Tan Ah Gao", "Pi Pah Kao", "Sarah Pam" };
    private int[] age = { 20, 25, 30 };
    private String[] temperature = { "310.95", "320.99", "400.95" };

    // getter setter here.
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
