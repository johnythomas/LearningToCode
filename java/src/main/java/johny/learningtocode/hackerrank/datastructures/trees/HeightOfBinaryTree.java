package johny.learningtocode.hackerrank.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {

    static int height(Node root) {
        if(root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int heigthItertive(Node root) {
        Queue<Node> queue = new LinkedList<>();
        int height = -1;
        queue.add(root);
        while (!queue.isEmpty()) {
            height++;
            int queueLength = queue.size();
            while (queueLength-- > 0) {
                Node currentNode = queue.remove();
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
        return height;
    }
}
