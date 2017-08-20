package johny.learningtocode.hackerearth.ds.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * problem url: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-welcome-problem/
 */
public class MonkAndWelcomeProblem {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        StringTokenizer a = new StringTokenizer(reader.readLine(), " ");
        StringTokenizer b = new StringTokenizer(reader.readLine(), " ");

        findArraySum(a, b, n, result);
        System.out.println(result.toString().trim());
    }

    static void findArraySum(StringTokenizer a, StringTokenizer b, int n, StringBuilder result) {
        while (n-- > 0) {
            result.append(Integer.parseInt(a.nextToken()) + Integer.parseInt(b.nextToken())).append(" ");
        }
    }
}
