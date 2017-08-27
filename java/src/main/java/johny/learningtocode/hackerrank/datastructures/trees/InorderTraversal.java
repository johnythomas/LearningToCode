package johny.learningtocode.hackerrank.datastructures.trees;

import java.util.Stack;

// Problem url: https://www.hackerrank.com/challenges/tree-inorder-traversal
public class InorderTraversal {

    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    void inOrderIterative(Node root) {
        if (root == null) return;

        StringBuilder resultBuilder = new StringBuilder();
        Stack<Node> stack = new Stack<>();
        do {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            resultBuilder.append(root.data).append(" ");
            if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        } while (!stack.isEmpty() || root != null);

        System.out.println(resultBuilder);
    }

}
