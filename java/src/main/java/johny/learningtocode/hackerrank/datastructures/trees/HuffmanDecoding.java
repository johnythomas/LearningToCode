package johny.learningtocode.hackerrank.datastructures.trees;

// Problem url: https://www.hackerrank.com/challenges/tree-huffman-decoding/problem
public class HuffmanDecoding {

    class Node {
        public int frequency;
        public char data;
        public Node left;
        public Node right;
    }

    void decode(String S, Node root) {

        Node runner = root;
        StringBuilder decodedString = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char code = S.charAt(i);
            runner = code == '1' ? runner.right : runner.left;
            if (runner.data != '\0') {
                decodedString.append(runner.data);
                runner = root;
            }
        }
        System.out.println(decodedString);
    }
}
