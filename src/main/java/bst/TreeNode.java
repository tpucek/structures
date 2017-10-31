package bst;

import java.util.LinkedList;
import java.util.List;

public class TreeNode<Type> {
    private TreeNode<Type> left;
    private TreeNode<Type> right;
    private Type value;

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

    public TreeNode(Type value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

