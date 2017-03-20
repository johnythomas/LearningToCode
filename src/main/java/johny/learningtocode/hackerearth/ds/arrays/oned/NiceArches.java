package johny.learningtocode.hackerearth.ds.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * problem url : https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/nice-arches-1/
 */
public class NiceArches {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int count = 0;
        while (m-- > 0) {
            String word = reader.readLine();
            if (isBubbly(word)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean isBubbly(String word) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            char currentCharacter = word.charAt(i);
            if (!stack.isEmpty() && stack.peek() == currentCharacter) {
                stack.pop();
            } else {
                stack.push(currentCharacter);
            }
        }
        return stack.isEmpty();
    }
}