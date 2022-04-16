package Speed_Thru_Slides.ExceptionLab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;

//This is a unit test using JUnit 4.. Not 5!
public class BankTest {

    CheckingAccount checkingAccount;

    @Before
    public void setup() {

        checkingAccount = new CheckingAccount(1000.00, 9123456);
    }

    @Test
    public void TestNormalDeposit() throws InsufficientFundsException {

        checkingAccount.deposit(100.00);
        assertEquals(checkingAccount.getBalance(), 1100.00);

    }

    @Test(expected = InsufficientFundsException.class)
    public void TestNegativeValueToDeposit() throws InsufficientFundsException {
        checkingAccount.deposit(-100.00);
    }

    @After
    public void tearDown() {
        checkingAccount = null;
    }

}
