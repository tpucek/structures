public class LinkedStack implements Stack {
    private Node top = null;
    private int length = 0;

    @Override
    public void push(double a) {
        Node next = new Node(a);

        if(top == null) {
            top = next;
        } else {
            Node actual = top;

            while (actual.next != null) {
                actual = actual.next;
            }

            actual.next = next;
        }

        ++length;
    }

    @Override
    public double pop() {
        return 0;
    }

    @Override
    public String toString() {
        if(length == 0) {
            return "[]";
        }

        StringBuilder textBuilder = new StringBuilder("[");

        Node actual = top;

        for(int i = 0; i < length - 1; ++i) {
            textBuilder.append(actual.value).append(", ");
            actual = actual.next;
        }

        textBuilder.append(actual.value).append("]");

        return textBuilder.toString();
    }

}
