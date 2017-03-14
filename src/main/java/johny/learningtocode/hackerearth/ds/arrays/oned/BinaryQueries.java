package johny.learningtocode.hackerearth.ds.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * problem url : https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/range-query-2/
 */
public class BinaryQueries {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String[] line = reader.readLine().split("\\s");
        int q = Integer.parseInt(line[1]);

        StringBuilder array = new StringBuilder(reader.readLine());

        while (q-- > 0) {
            String[] query = reader.readLine().split("\\s");
            if (query[0].equals("0")) {
                result.append(doBinaryQuery(array, Integer.parseInt(query[1]), Integer.parseInt(query[2]))).append("\n");
            } else {
                doBinaryQuery(array, Integer.parseInt(query[1]));
            }
        }
        System.out.println(result);
    }

    static String doBinaryQuery(StringBuilder array, int l, int r) {
        return array.charAt((r - 1) * 2) == '0' ? "EVEN" : "ODD";
    }

    static void doBinaryQuery(StringBuilder array, int x) {
        array.setCharAt((x - 1) * 2, array.charAt((x - 1) * 2) == '1' ? '0' : '1');
    }
}
