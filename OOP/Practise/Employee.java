public class Employee {
    String name;
    private int age;

    public Employee() {

    }

    public Employee(String a, int b) {

        this.name = a;
        this.age = b;
    }

    public void sayHello() {
        System.out.println("Hello Employees!");
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return "Name added successfully.";
    }

    public int getAge() {
        return this.age;
    }

    public String setAge(int age) {
        this.age = age;
        return "Age added successfully";
    }

}
