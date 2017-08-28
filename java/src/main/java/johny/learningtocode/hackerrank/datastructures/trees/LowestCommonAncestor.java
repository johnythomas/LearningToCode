package johny.learningtocode.hackerrank.datastructures.trees;

// Problem url: https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor
public class LowestCommonAncestor {

    static Node lca(Node root, int v1, int v2) {

        if (root == null) return root;

        Node runner = root;
        while (runner != null) {
            if (v1 > runner.data && v2 > runner.data) {
                runner = runner.right;
            } else if (v1 < runner.data && v2 < runner.data) {
                runner = runner.left;
            } else {
                return runner;
            }
        }

        return runner;
    }
}
