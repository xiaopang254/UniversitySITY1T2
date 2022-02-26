public class SalariedEmployee extends Employee {

    int salary;

    public SalariedEmployee() {

    }

    public SalariedEmployee(String a, int b, int c) {
        super(a, b);
        salary = c;
    }
}
