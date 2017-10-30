import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Random random = new Random();

        Stack test = new LinkedStack();
        test.push(1);
        test.push(2);
        System.out.println(test);
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Start entering numbers following with enter");
        Stack<Integer> linkedStack = new LinkedStack<>();
        int numberRead;

        do{
            numberRead = scanner.nextInt();
            linkedStack.push(numberRead);
        }while(numberRead != 0);

        //System.out.println(linkedStack.pop);

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
