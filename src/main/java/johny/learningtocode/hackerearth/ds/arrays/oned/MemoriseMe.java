package johny.learningtocode.hackerearth.ds.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem url: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/memorise-me/description/
 */
public class MemoriseMe {

    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] array = reader.readLine().split("\\s");
        Map<Integer, Integer> numberFrequency = findNumberFrequency(array, n);
        int q = Integer.parseInt(reader.readLine());
        while (q-- > 0) {
            result.append(executeQuery(Integer.parseInt(reader.readLine()), numberFrequency)).append("\n");
        }
        System.out.println(result);
    }

    static Map<Integer, Integer> findNumberFrequency(String[] array, int n) {
        Map<Integer, Integer> numberFrequency = new HashMap<>();
        for (int index = 0; index < n; index++) {
            int element = Integer.parseInt(array[index]);
            numberFrequency.putIfAbsent(element, 0);
            numberFrequency.put(element, numberFrequency.get(element) + 1);
        }
        return numberFrequency;
    }

    static String executeQuery(int b, Map<Integer, Integer> numberFrequency) {
        return numberFrequency.get(b) == null ? "NOT PRESENT" : String.valueOf(numberFrequency.get(b));
    }
}