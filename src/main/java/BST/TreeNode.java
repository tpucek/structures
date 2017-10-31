package BST;


public class TreeNode<Type> {
    private TreeNode<Type> left;
    private TreeNode<Type> right;
    private Type value;



    @Override
    public String toString() {
        return "TreeNode{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }

    public TreeNode<Type> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<Type> left) {
        this.left = left;
    }

    public TreeNode<Type> getRight() {
        return right;
    }

    public void setRight(TreeNode<Type> right) {
        this.right = right;
    }

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }
}
