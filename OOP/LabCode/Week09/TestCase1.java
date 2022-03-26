import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.*;

public class TestCase1 {
    RandomCharacter randomChar = new RandomCharacter();;

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

    @RepeatedTest(5)
    public void testPrimeLowerRandomCharacter() {
        int prime = randomChar.getRandomPrimeNumber();
        assertTrue(randomChar.primeChecker(prime));
    }

}
