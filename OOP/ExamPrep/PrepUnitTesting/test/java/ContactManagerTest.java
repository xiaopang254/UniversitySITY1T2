package PrepUnitTesting.test.java;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

import PrepUnitTesting.main.java.Contact;
import PrepUnitTesting.main.java.Exceptions.InvalidatePhoneException;

public class ContactManagerTest {

    Contact contact;

    @BeforeEach
    public void setUp() {
        System.out.println("Set up");
        contact = new Contact();
    }

    @Test
    public void normalInput() {
        contact.setPhoneNumber("91234567");
        assertTrue(contact.getPhoneNumber() == "91234567");
    }

    @Test
    public void invalidStartingNumber() {
        contact.setPhoneNumber("12345678");
        assertTrue(contact.getPhoneNumber() == null);
    }

    // @Test
    // public void invalidPhoneException() {
    // assertThrows(InvalidatePhoneException.class, () -> {
    // contact.setPhoneNumber("12345678");
    // });
    // }

    @AfterEach
    public void tearDown() {
        System.out.println("Tear Down");
        contact = null;
        assertNull(contact);
    }

}
