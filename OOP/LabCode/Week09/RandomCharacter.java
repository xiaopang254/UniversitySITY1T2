
import java.util.Random;

public class RandomCharacter {
    private final static int ALPHABET = 26;
    private final static int DIGITS = 9;
    private char[] smallAlphabet = "abcdefghijklmnopqrstuvwsyz".toCharArray();
    private char[] bigAlphabet = "abcdefghijklmnopqrstuvwsyz".toUpperCase().toCharArray();
    private char[] num = "0123456789".toCharArray();
    private final static int min = 0;
    private final static int max = 100;

    static Random random = new Random();

    public RandomCharacter() {

    }

    private int randomNum(int modulus) {
        return random.nextInt((max - min) + min) % modulus;
    }

    public char getRandomLowerCaseLetter() {
        return smallAlphabet[randomNum(ALPHABET)];
    }

    public char getRandomUpperCaseLetter() {
        return bigAlphabet[randomNum(ALPHABET)];
    }

    public char getRandomDigitCharacter() {
        return num[randomNum(DIGITS)];
    }

    public char getRandomCharacter() {
        int i = randomNum(3);
        if (i == 0) {
            return getRandomLowerCaseLetter();
        } else if (i == 1) {
            return getRandomUpperCaseLetter();
        } else {
            return getRandomDigitCharacter();
        }
    }
}
