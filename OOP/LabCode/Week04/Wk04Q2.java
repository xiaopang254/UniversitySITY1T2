public class Wk04Q2 {

    public static void main(String[] args) {

        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
