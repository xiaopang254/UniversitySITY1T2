import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.*;

public class TestCase1 {
    RandomCharacter randomChar;

    @BeforeEach
    void setup() {
        randomChar = new RandomCharacter();
    }

    @Test
    @DisplayName("Testing Random Lower Case Characters")
    public void testRandomLowerCharacters() {
        char result = randomChar.getRandomLowerCaseLetter();

        assertTrue((result >= 'a' && result <= 'z'));

    }

    @Test
    @DisplayName("Testing Random Upper Case Characters")
    public void testRandomUpperCharacter() {
        char result = randomChar.getRandomUpperCaseLetter();

        assertTrue((result >= 'A' && result <= 'Z'));
    }

    @Test
    @DisplayName("Testing Random Digit Characters")
    public void testRandomDigitCharacter() {
        char result = randomChar.getRandomDigitCharacter();

        assertTrue((result >= '0' && result <= '9'));

    }

    @Test
    @DisplayName("Testing Random Digit Characters")
    public void testRandomCharacter() {
        char result = randomChar.getRandomCharacter();

        assertTrue((result >= '0' && result <= '9') || (result >= 'a' && result <= 'z')
                || (result >= 'A' && result <= 'Z'));

    }

    private boolean primeChecker(int prime) {

        for (int i = 1; i < prime; i++)
            if (prime % i == 0)
                return false;

        return true;
    }

    @RepeatedTest(50)
    public void testPrimeLowerRandomCharacter() {
        char prime = randomChar.getRandomLowerCaseLetter();
        assertTrue(primeChecker(prime));

    }

    @RepeatedTest(50)
    public void testPrimeUpperRandomCharacter() {
        char prime = randomChar.getRandomUpperCaseLetter();
        assertTrue(primeChecker(prime));

    }

    @RepeatedTest(50)
    public void testPrimeDigitRandomCharacter() {
        char prime = randomChar.getRandomDigitCharacter();
        assertTrue(primeChecker(prime));
    }

    @RepeatedTest(50)
    public void testPrimeRandomCharacter() {
        char prime = randomChar.getRandomCharacter();
        assertTrue(primeChecker(prime));

    }

}
