import java.util.EmptyStackException;
import java.util.function.Function;

public class ArrayStack<Type> implements Stack<Type> {
    private Function<Integer, Type[]> supplier;
    private Type[] array;
    private int length;
    private int sizeToAdd;

    public ArrayStack(int size, int sizeToAdd, Function<Integer, Type[]> supplier) {
        this.supplier = supplier;
        array = supplier.apply(size);
        length = 0;
        this.sizeToAdd = sizeToAdd;
    }

    @Override
    public void push(Type a) {
        if(length == array.length) {
            addSize(sizeToAdd);
        }
        array[length] = a;
        ++length;
    }

    public void addSize(int add) {
        Type[] temp = supplier.apply(length + add);

        System.arraycopy(array, 0, temp, 0, array.length);

        array = temp;
    }

    @Override
    public Type pop() {
        if(length <= 0) {
            throw new EmptyStackException();
        }
        Type temp = array[length - 1];
        --length;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return length <= 0;
    }

    @Override
    public String toString() {
        if(length == 0) {
            return "[]";
        }

        StringBuilder textBuilder = new StringBuilder("[");
        for(int i = 0; i < length - 1; ++i) {
            textBuilder.append(array[i]).append(", ");
        }

        textBuilder.append(array[length - 1]).append("]");

        return textBuilder.toString();
    }
}

