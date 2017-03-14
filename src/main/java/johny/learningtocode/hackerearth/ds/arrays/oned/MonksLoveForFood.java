package johny.learningtocode.hackerearth.ds.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monks-love-for-food/
 */
public class MonksLoveForFood {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int q = Integer.parseInt(reader.readLine());

        Stack<Integer> foodPile = new Stack<>();
        while (q-- > 0) {
            String[] query = reader.readLine().split("\\s");
            executeQuery(foodPile, query, result);
        }
        System.out.println(result);
    }

    static void executeQuery(Stack<Integer> foodPile, String[] query, StringBuilder result) {
        if (query[0].equals("1")) {
            if (foodPile.isEmpty()) {
                result.append("No Food").append("\n");
                return;
            }
            result.append(foodPile.pop()).append("\n");
        } else {
            foodPile.push(Integer.parseInt(query[1]));
        }
    }
}
