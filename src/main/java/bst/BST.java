package bst;

public class BST {
    private TreeNode<Integer> root;

    public void add(int a) {
        TreeNode<Integer> node = new TreeNode<>(a);
        if(root == null) {
            root = new TreeNode<>(a);
        } else {
            TreeNode<Integer> current = root;

            while (current != null) {
                if (a > current.getValue()) {
                    TreeNode<Integer> right = current.getRight();
                    if (right == null) {
                        current.setRight(node);
                        current = null;
                    } else {
                        current = right;
                    }
                } else {
                    TreeNode<Integer> left = current.getLeft();
                    if (left == null) {
                        current.setLeft(node);
                        current = null;
                    } else {
                        current = left;
                    }
                }
            }
        }
    }

    public void find(int number) {
        TreeNode<Integer> current = root;

        while (current != null) {
            if(current.getValue() == number) {
                System.out.println("Found: " + number);
                return;
            } else if(number > current.getValue()) {
                current = current.getRight();
            } else {
                current = current.getLeft();
            }
        }

        System.out.println("Not found: " + number);
    }
}
