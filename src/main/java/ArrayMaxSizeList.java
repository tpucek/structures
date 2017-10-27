import java.util.Arrays;

public class ArrayMaxSizeList implements List {
    private double[] array;
    private int length;

    public ArrayMaxSizeList(int size) {
        array = new double[size];
        length = 0;
    }

    @Override
    public void add(double a) {
        array[length] = a;
        ++length;
    }

    @Override
    public void remove(int index) {
        if(index >= length) {
            throw new IndexOutOfBoundsException(index + " >= " + length);
        }

        for(int i = index; i < length - 1; ++i) {
            array[i] = array[i + 1];
        }
        --length;
    }

    @Override
    public double get(int i) {
        if(i >= length) {
            throw new IndexOutOfBoundsException(i + " >= " + length);
        }
        return array[i];
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
        for(int i = 0; i < length - 1; ++i) {
            textBuilder.append(array[i]).append(", ");
        }

        textBuilder.append(array[length - 1]).append("]");

        return textBuilder.toString();
    }
}
