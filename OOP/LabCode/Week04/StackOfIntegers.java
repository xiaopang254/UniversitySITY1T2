import java.util.Arrays;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
        this.size = 0;
    }

    public boolean empty() {

        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public int peek() {
        return this.elements[0];
    }

    public void push(int value) {
        if (this.size + 1 > this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.elements.length + 10);
        }
        this.elements[this.size++] = value;
    }

    public int pop() {
        return this.elements[--this.size];
    }

    public int getSize() {
        return this.size;
    }

}
