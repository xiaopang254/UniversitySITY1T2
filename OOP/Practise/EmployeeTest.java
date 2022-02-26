import java.util.concurrent.Semaphore;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.sayHello();

        SalariedEmployee sEmployee = new SalariedEmployee();
        sEmployee.salary = 100;
        sEmployee.setName("Bob");
        sEmployee.setAge(21);

        SalariedEmployee s2Employee = new SalariedEmployee("James", 30, 1000);

        s2Employee.name = "HelloName";
        System.out.println(sEmployee.getName());
        System.out.println(sEmployee.getAge());
        System.out.println(s2Employee.getName());
        System.out.println(s2Employee.getAge());

        sEmployee.sayHello();
    }
}