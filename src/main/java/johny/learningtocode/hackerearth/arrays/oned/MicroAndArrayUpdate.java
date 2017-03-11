package johny.learningtocode.hackerearth.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * problem url: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update/
 */
public class MicroAndArrayUpdate {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {

            String[] line = reader.readLine().split("\\s");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);

            int[] array = new int[n];

            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(tokenizer.nextToken());
            }

            result.append(findMinimumTimeRequired(array, k)).append("\n");
        }
        System.out.println(result);
    }

    static int findMinimumTimeRequired(int[] array, int k) {
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement > k ? 0 : k - minElement;
    }
}
