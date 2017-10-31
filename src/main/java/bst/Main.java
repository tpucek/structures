package bst;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] tab = randomTab();

        BST bst = new BST();

        for(int a : tab) {
            bst.add(a);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number:");
        int number = scanner.nextInt();

        long start = System.nanoTime();
        findInTab(tab, number);
        long stop = System.nanoTime();
        System.out.println("Simple: " + (stop - start));

        start = System.nanoTime();
        bst.find(number);
        stop = System.nanoTime();
        System.out.println("BST: " + (stop - start));
    }

    public static void findInTab(int[] tab, int number) {
        for(int a : tab) {
            if(number == a) {
                System.out.println("Found: " + number);
                return;
            }
        }

        System.out.println("Not found: " + number);
    }

    public static int[] randomTab() {
        Random random = new Random();
        int size = random.nextInt(2500) + 5000;

        List<Integer> values = new LinkedList<>();

        for(int i = 0;i < 100000;++i) {
            values.add(i);
        }

        int[] tab = new int[size];

        for(int i = 0;i < size;++i) {
            int number = values.remove(random.nextInt(values.size()));
            tab[i] = number;
        }

        return tab;
    }
}
