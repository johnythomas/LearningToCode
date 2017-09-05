package johny.learningtocode.hackerrank.datastructures.trees;

public class IsABinarySearchTree {

    boolean checkBST(Node root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node root, int minValue, int maxValue) {
        if (root == null) return true;
        return root.data > minValue
                && root.data < maxValue
                && isBST(root.left, minValue, root.data)
                && isBST(root.right, root.data, maxValue);
    }
}
