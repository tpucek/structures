package tree;

import java.util.LinkedList;
import java.util.List;

public class TreeNode<Type> {
    private TreeNode<Type> parent;
    private List<TreeNode<Type>> children = new LinkedList<>();
    private Type value;

    public TreeNode<Type> getParent() {
        return parent;
    }

    public List<TreeNode<Type>> getChildren() {
        return children;
    }

    public Type getValue() {
        return value;
    }

    public TreeNode(Type value) {
        this.value = value;
    }

    public TreeNode(Type value, TreeNode<Type> parent) {
        this.value = value;
        this.parent = parent;
        parent.children.add(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(value);

        if(!children.isEmpty()) {
            sb.append(children);
        }

        return sb.toString();
    }
}
