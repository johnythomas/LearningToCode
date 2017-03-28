package johny.learningtocode.hackerrank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SparseArrays {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();
        Map<String, Integer> stringCount = new HashMap<>();
        while (n-- > 0) {
            addString(stringCount, reader.readLine());
        }
        int q = Integer.parseInt(reader.readLine());
        while (q-- > 0) {
            Integer count = stringCount.get(reader.readLine());
            result.append(count == null ? 0 : count).append("\n");
        }
        System.out.println(result);
    }

    static void addString(Map<String, Integer> stringCount, String str) {
        if (stringCount.containsKey(str)) {
            stringCount.put(str, stringCount.get(str) + 1);
        } else {
            stringCount.put(str, 1);
        }
    }
}
