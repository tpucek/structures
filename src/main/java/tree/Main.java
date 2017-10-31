package tree;

public class Main {
    public static void main(String[] args) {
        TreeNode<String> root = new TreeNode<String>("root");

        TreeNode<String> left = new TreeNode<String>("left", root);
        TreeNode<String> right = new TreeNode<String>("right", root);

        TreeNode<String> right0 = new TreeNode<String>("right0", right);
        TreeNode<String> right1 = new TreeNode<String>("right1", right);
        TreeNode<String> right2 = new TreeNode<String>("right2", right);
        TreeNode<String> right3 = new TreeNode<String>("right3", right);

        System.out.println(root);
    }
}
