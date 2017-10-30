import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Stack test = new LinkedStack();
        test.push(1);
        test.push(2);
        System.out.println(test);

      /*  for(int i = 0;i < 10;++i) {
            test.add(random.nextInt(1000) / 10.0);
        }

        System.out.println(test);
        test.remove(9);
        System.out.println(test);
        test.remove(1);
        System.out.println(test);
        test.remove(0);
        System.out.println(test);

        List test2 = new LinkedList();
        test2.add(random.nextInt(1000) / 10.0);
        System.out.println(test2);
        test2.remove(0);
        System.out.println(test2);
        */
    }
}
