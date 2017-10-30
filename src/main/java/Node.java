public class Node<Type> {
    public Type value;
    public Node<Type> next;
    public Node<Type> previous;

    public Node(Type value) {
        this.value = value;
        next = null;
        previous = null;
    }
}
