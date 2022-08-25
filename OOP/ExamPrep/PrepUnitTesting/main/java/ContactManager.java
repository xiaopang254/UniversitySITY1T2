package PrepUnitTesting.main.java;

public class ContactManager {

    public static void main(String[] args) {
        System.out.println("This is a Contact Manager that manages contact!");
        Contact contact = new Contact();

        contact.setPhoneNumber("11234567");
        System.out.println(contact.getPhoneNumber());
    }

}
