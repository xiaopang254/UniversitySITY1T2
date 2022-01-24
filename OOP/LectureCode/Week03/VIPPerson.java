import java.util.jar.Attributes.Name;

public class VIPPerson extends Person {
    private String grade;

    public VIPPerson(String name, String address, String grade) {
        super(name, address);
        this.grade = grade;

    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
