import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        /*List<Integer> test = new ArrayList<Integer>(10, 5, (Integer size) -> {
            return new Integer[size];
        });*/

        List<Integer> test = new ArrayList<Integer>(10, 5, size -> new Integer[size]);

        for(int i = 0;i < 10;++i) {
            test.add(random.nextInt(100));
        }

        System.out.println(test);
        test.remove(9);
        System.out.println(test);
        test.remove(1);
        System.out.println(test);
        test.remove(0);
        System.out.println(test);

        List<Double> test2 = new LinkedList<>();
        test2.add(random.nextInt(1000) / 10.0);
        System.out.println(test2);
        test2.remove(0);
        System.out.println(test2);

        /*Stack stack = new LinkedStack();
        stack.push(random.nextInt(1000) / 10.0);
        System.out.println(stack);
        stack.push(random.nextInt(1000) / 10.0);
        stack.push(random.nextInt(1000) / 10.0);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.pop();
        stack.pop();
        //stack.pop();
        System.out.println(stack);
        Queue<Integer> a;*/
    }
}
