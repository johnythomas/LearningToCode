package johny.learningtocode.hackerrank.algorithms.constructive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

// Problem url: https://www.hackerrank.com/challenges/new-year-chaos
public class NewYearChaos {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            int[] queue = Stream.of(reader.readLine().split("\\s"))
                    .mapToInt(Integer::valueOf)
                    .toArray();
            result.append(calculateBribe(queue, n)).append("\n");
        }
        System.out.println(result);
    }

    static String calculateBribe(int[] queue, int n) {
        int bribe = 0;
        boolean tooChaotic = false;
        for (int i = n - 1; i > 0; i--) {
            if (queue[i] == i + 1) {
                continue;
            }
            for (int j = Math.max(i - 2, 0); j < i; j++) {
                if (queue[j] == i + 1) {
                    bribe++;
                    int temp = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = temp;
                }
            }
            if (queue[i] != i + 1) {
                tooChaotic = true;
                break;
            }
        }
        return tooChaotic ? "Too chaotic" : String.valueOf(bribe);
    }
}
