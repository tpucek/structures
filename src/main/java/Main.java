import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        /*List<Integer> arrayList = new ArrayList<Integer>(10, 5, (Integer size) -> {
            return new Integer[size];
        });*/

        System.out.println("ArrayList:");

        List<Integer> arrayList = new ArrayList<Integer>(10, 5, size -> new Integer[size]);

        for(int i = 0;i < 10;++i) {
            arrayList.add(random.nextInt(100));
        }

        /*System.out.println(arrayList);
        arrayList.remove(9);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println("");
        System.out.println("LinkedList:");*/

        List<Double> linkedList = new LinkedList<>();
        linkedList.add(random.nextInt(1000) / 10.0);
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);

        System.out.println("");
        System.out.println("LinkedStack:");

        Stack<Double> linkedStack = new LinkedStack<>();
        linkedStack.push(random.nextInt(1000) / 10.0);
        System.out.println(linkedStack);
        linkedStack.push(random.nextInt(1000) / 10.0);
        linkedStack.push(random.nextInt(1000) / 10.0);
        System.out.println(linkedStack);
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack);
        linkedStack.pop();
        linkedStack.pop();
        //linkedStack.pop();
        System.out.println(linkedStack);

        System.out.println("");
        System.out.println("LinkedStack:");

        Stack<Integer> arrayStack = new ArrayStack<>(10, 5, size -> new Integer[size]);
        arrayStack.push(random.nextInt(100));
        System.out.println(arrayStack);
        arrayStack.push(random.nextInt(100));
        arrayStack.push(random.nextInt(100));
        System.out.println(arrayStack);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack);
        arrayStack.pop();
        arrayStack.pop();
        //arrayStack.pop();
        System.out.println(arrayStack);
    }
}
