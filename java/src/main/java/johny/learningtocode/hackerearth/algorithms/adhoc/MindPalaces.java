package johny.learningtocode.hackerearth.algorithms.adhoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Problem URL: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/mind-palaces-3/
 */
public class MindPalaces {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split("\\s");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        long[][] memory = new long[n][m];
        for (int i = 0; i < n; i++) {
            line = br.readLine().split("\\s");
            for (int j = 0; j < m; j++) {
                memory[i][j] = Long.parseLong(line[j]);
            }
        }

        int q = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();

        while (q-- > 0) {
            long y = Long.parseLong(br.readLine());
            int indexX = -1;
            int indexY = -1;
            for (int i = 0; i < n; i++) {
                int index = Arrays.binarySearch(memory[i], y);
                if (index >= 0) {
                    indexX = i;
                    indexY = index;
                }
            }
            result.append(indexX).append(" ").append(indexY).append("\n");
        }
        System.out.println(result.toString());
    }
}
