public class LinkedList implements List {
    private Node first = null;
    private int length = 0;

    @Override
    public void add(double a) {
        Node next = new Node(a);

        if(first == null) {
            first = next;
        } else {
            Node actual = first;

            while (actual.next != null) {
                actual = actual.next;
            }

            actual.next = next;
        }

        ++length;
    }

    @Override
    public void remove(int index) {
        if(index >= length || index < 0) {
            throw new IndexOutOfBoundsException(index + " >= " + length);
        }

        if(index == 0) {
            first = first.next;
            --length;
            return;
        }

        Node actual = first;

        for(int i = 0;i < index - 1;++i) {
            actual = actual.next;
        }

        actual.next = actual.next.next;
        --length;
    }

    @Override
    public double get(int index) {
        if(index >= length) {
            throw new IndexOutOfBoundsException(index + " >= " + length);
        }

        Node actual = first;

        for(int i = 0;i < index;++i) {
            actual = actual.next;
        }

        return actual.value;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public String toString() {
        if(length == 0) {
            return "[]";
        }

        StringBuilder textBuilder = new StringBuilder("[");

        Node actual = first;

        for(int i = 0; i < length - 1; ++i) {
            textBuilder.append(actual.value).append(", ");
            actual = actual.next;
        }

        textBuilder.append(actual.value).append("]");

        return textBuilder.toString();
    }
}
