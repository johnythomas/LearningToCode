package johny.learningtocode.hackerearth.math.combinatorics.inclusionexclusion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Problem URL: https://www.hackerearth.com/practice/math/combinatorics/inclusion-exclusion/practice-problems/algorithm/andrew-and-wengaluru-city/
 */
public class AndrewAndWengaluruCity {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] arr = Stream.of(br.readLine().split("\\s")).mapToLong(Long::valueOf).toArray();

            long[] leftMax = new long[n];
            long[] rightMax = new long[n];

            leftMax[0] = -1;
            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(arr[i - 1], leftMax[i - 1]);
            }

            rightMax[n - 1] = -1;
            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(arr[i + 1], rightMax[i + 1]);
            }

            long water = 0;
            for (int i = 0; i < n; i++) {
                water += leftMax[i] < 0 || rightMax[i] < 0
                        ? 0
                        : Math.max(0, Math.min(leftMax[i], rightMax[i]) - arr[i]);
            }

            result.append(water).append("\n");
        }

        System.out.println(result.toString());
    }
}
