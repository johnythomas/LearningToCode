package johny.learningtocode.hackerrank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorithmicCrush {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split("\\s");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        String[] operations = new String[m];
        for (int i = 0; i < m; i++) {
            operations[i] = reader.readLine();
        }
        System.out.println(findMaxValue(n, operations));
    }

    static long findMaxValue(int n, String[] operations) {
        long maxValue = 0;
        long[] list = new long[n];
        for (String o : operations) {
            String[] operation = o.split("\\s");
            int a = Integer.parseInt(operation[0]);
            int b = Integer.parseInt(operation[1]);
            long k = Long.parseLong(operation[2]);
            list[a - 1] += k;
            if (b < n) {
                list[b] -= k;
            }
        }
        for (int i = 1; i < n; i++) {
            list[i] = list[i] + list[i - 1];
            if (list[i] > maxValue) {
                maxValue = list[i];
            }
        }
        return maxValue;
    }
}