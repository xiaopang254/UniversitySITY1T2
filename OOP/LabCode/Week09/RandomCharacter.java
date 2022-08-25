
import java.util.Random;

public class RandomCharacter {
    private final static int ALPHABET = 26;
    private final static int DIGITS = 9;
    private final static int PRIME = 100;
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

    private int randomNum2() {
        return random.nextInt((100 - 1) + 1);
    }

    public char getRandomLowerCaseLetter() {
        return smallAlphabet[randomNum(ALPHABET)];
    }

    public char getRandomUpperCaseLetter() {
        return bigAlphabet[randomNum(ALPHABET)];
    }

    public int getRandomDigitCharacter() {
        int number = random.nextInt(9 - 0 + 1) + 0;
        return number;
        // return num[randomNum(DIGITS)];
    }

    public int getRandomPrimeNumber() {
        int prime = randomNum2();
        // while (primeChecker(prime) != true) {
        // prime = randomNum2();
        // }
        return prime;
    }

    public boolean primeChecker(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++)
                if ((num % i) == 0)
                    return false;
        }
        return true;
    }

    public char getRandomCharacter() {
        int i = randomNum(3);
        if (i == 0) {
            return getRandomLowerCaseLetter();
        } else if (i == 1) {
            return getRandomUpperCaseLetter();
        } else {
            char num = Integer.toString(getRandomDigitCharacter()).charAt(0);
            return num;
        }
    }
}
