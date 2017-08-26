package johny.learningtocode.hackerrank.datastructures.trees;

import java.util.Stack;

// Problem url: https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
public class PreorderTraversal {

    void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void preOrderIterative(Node root) {
        if (root == null) return;
        StringBuilder preOrderResultBuilder = new StringBuilder();
        Node runner = root;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
            preOrderResultBuilder.append(currentNode.data).append(" ");
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
        System.out.println(preOrderResultBuilder);
    }
}
