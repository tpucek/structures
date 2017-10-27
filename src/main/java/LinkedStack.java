import java.util.EmptyStackException;

public class LinkedStack implements Stack {
    private Node top = null;

    @Override
    public void push(double a) {
        Node newTop = new Node(a);
        newTop.previous = top;
        top = newTop;
    }

    @Override
    public double pop() {
        if(top == null) {
            throw new EmptyStackException();
        }

        Node previousTop = top;
        top = top.previous;
        return previousTop.value;
    }

    @Override
    public String toString() {
        if(top == null) {
            return "[]";
        }

        StringBuilder textBuilder = new StringBuilder("[");

        Node actual = top;

        while(actual.previous != null) {
            textBuilder.append(actual.value).append(", ");
            actual = actual.previous;
        }

        textBuilder.append(actual.value).append("]");

        return textBuilder.toString();
    }
}
