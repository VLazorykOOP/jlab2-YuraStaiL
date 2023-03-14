import java.lang.Math;
public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void remove(int data) {
        root = removeRecursive(root, data);
    }

    private Node removeRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.data) {
            // node to be deleted found
            if (current.left == null && current.right == null) {
                // node is a leaf node
                return null;
            } else if (current.right == null) {
                // node has one child (left)
                return current.left;
            } else if (current.left == null) {
                // node has one child (right)
                return current.right;
            } else {
                // node has two children
                int smallestValue = findSmallestValue(current.right);
                current.data = smallestValue;
                current.right = removeRecursive(current.right, smallestValue);
                return current;
            }
        }

        if (data < current.data) {
            current.left = removeRecursive(current.left, data);
            return current;
        }

        current.right = removeRecursive(current.right, data);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    public boolean contains(int data) {
        return containsRecursive(root, data);
    }

    private boolean containsRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }

        if (data == current.data) {
            return true;
        }

        return data < current.data ? containsRecursive(current.left, data) : containsRecursive(current.right, data);
    }
}