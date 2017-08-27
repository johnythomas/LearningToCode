package johny.learningtocode.hackerrank.datastructures.trees;

import java.util.Stack;

// Problem url: https://www.hackerrank.com/challenges/tree-top-view
public class TopView {

    void topView(Node root) {

        if (root == null) return;

        StringBuilder result = new StringBuilder();
        // getting the left side of the tree
        Stack<Node> stack = new Stack<>();
        Node runner = root;
        while (runner != null) {
            stack.push(runner);
            runner = runner.left;
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop().data).append(" ");
        }
        // getting the rightmost side of the tree
        runner = root.right;
        while(runner != null) {
            result.append(runner.data).append(" ");
            runner = runner.right;
        }
        System.out.println(result);
    }
}
