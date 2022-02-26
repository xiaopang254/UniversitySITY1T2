package abstraction;

public class RichPerson extends AveragePerson {
    public String introduce() {
        return "I am a Rich Person!";
    }

    public static void main(String[] args) {
        System.out.println(new RichPerson().introduce());
        System.out.println(new RichPerson().sayHello());
    }

}
