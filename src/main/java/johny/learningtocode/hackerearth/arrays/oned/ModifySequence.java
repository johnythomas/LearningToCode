package johny.learningtocode.hackerearth.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * problem url : https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/modify-sequence/
 */
public class ModifySequence {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        System.out.println(isValidSequence(tokenizer, n));

    }

    static String isValidSequence(StringTokenizer tokenizer, int n) {
        int[] array = new int[n];
        for (int i = 0; tokenizer.hasMoreTokens(); i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for (int i = 0; i < n - 1; i++) {
            if (array[i + 1] - array[i] >= 0) {
                array[i + 1] = array[i + 1] - array[i];
                array[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!(array[i] == 0)) {
                return "NO";
            }
        }
        return "YES";
    }
}
