package johny.learningtocode.hackerrank.datastructures.trees;

// Problem url: https://www.hackerrank.com/challenges/binary-search-tree-insertion
public class BSTInsertion {

    static Node insert(Node root, int value) {
        Node newNode = createNode(value);

        if (root == null) return newNode;

        Node parent = null;
        Node current = root;
        while (current != null) {
            parent = current;
            if (value > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        if (value > parent.data) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }

        return root;
    }

    static Node createNode(int value) {
        Node node = new Node();
        node.data = value;
        node.left = node.right = null;
        return node;
    }
}
