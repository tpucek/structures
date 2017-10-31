import java.util.EmptyStackException;

public class LinkedStack<Type> implements Stack<Type> {
    private Node<Type> top = null;

    @Override
    public void push(Type a) {
        Node<Type> newTop = new Node<>(a);
        newTop.previous = top;
        top = newTop;
    }

    @Override
    public Type pop() {
        if(top == null) {
            throw new EmptyStackException();
        }

        Node<Type> previousTop = top;
        top = top.previous;
        return previousTop.value;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
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
