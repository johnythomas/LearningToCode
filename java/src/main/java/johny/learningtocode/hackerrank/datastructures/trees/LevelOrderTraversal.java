package johny.learningtocode.hackerrank.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

// Problem url: https://www.hackerrank.com/challenges/tree-level-order-traversal
public class LevelOrderTraversal {

    void levelOrder(Node root) {

        StringBuilder result = new StringBuilder();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            while (queueSize-- > 0) {
                Node currentNode = queue.remove();
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
                result.append(currentNode.data).append(" ");
            }
        }
        System.out.println(result);
    }
}
