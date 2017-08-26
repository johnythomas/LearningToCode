package johny.learningtocode.hackerrank.datastructures.trees;

import java.util.Stack;

// Problem url: https://www.hackerrank.com/challenges/tree-postorder-traversal
public class PostOrderTraversal {

    void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    void postOrderIterative(Node root) {

        if (root == null) return;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node currentNode = stack1.pop();
            stack2.push(currentNode);
            if (currentNode.left != null) {
                stack1.push(currentNode.left);
            }
            if (currentNode.right != null) {
                stack1.push(currentNode.right);
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        while (!stack2.isEmpty()) {
            resultBuilder.append(stack2.pop().data).append(" ");
        }
        System.out.println(resultBuilder);
    }
}
