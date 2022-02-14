
public class BMI {

    private double pounds;
    private double kilograms;
    private double meters;
    private double inches;

    public BMI(double pounds, double inches) {

        this.pounds = pounds;
        this.inches = inches;
    }

    public double getPounds() {
        return this.pounds;
    }

    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    public double getInches() {
        return this.inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    private double convertToKilograms() {
        return (this.getPounds() * 0.45359237);
    }

    private double convertToMeters() {
        return (this.getInches() * 0.0254);
    }

    public void calculateBMI() {
        double kilogram = convertToKilograms();
        double meters = convertToMeters();
        double BMI = kilogram / Math.pow(meters, 2);
        System.out.println("BMI is " + BMI);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI < 25.0) {
            System.out.println("Normal");
        } else if (BMI < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
