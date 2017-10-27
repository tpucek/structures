public class ArrayList implements List {
    private double[] array;
    private int length;
    private int sizeToAdd;

    public ArrayList(int size, int sizeToAdd) {
        array = new double[size];
        length = 0;
        this.sizeToAdd = sizeToAdd;
    }

    @Override
    public void add(double a) {
        if(length == array.length) {
            addSize(sizeToAdd);
        }
        array[length] = a;
        ++length;
    }

    public void addSize(int add) {
        double[] temp = new double[length + add];

        System.arraycopy(array, 0, temp, 0, array.length);

        array = temp;
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
