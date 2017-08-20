package johny.learningtocode.hackerearth.ds.arrays.oned;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * Problem url: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/golf/distinct-count-2/description/
 */
public class MostFrequent {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        System.out.println(getNumberWithMaxFrequency(reader.readLine()));
    }

    static String getNumberWithMaxFrequency(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line, " ");
        Map<String, Integer> frequency = new TreeMap<>();
        while (tokenizer.hasMoreTokens()) {
            String number = tokenizer.nextToken();
            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.get(number) + 1);
            } else {
                frequency.put(number, 1);
            }
        }
        return findMaxFrqNumFromMap(frequency);
    }

    private static String findMaxFrqNumFromMap(Map<String, Integer> frequency) {
        int maxFreq = 0;
        String number = String.valueOf(Integer.MAX_VALUE);
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxFreq || (entry.getValue() == maxFreq && isSmallerThan(entry.getKey(), number))) {
                maxFreq = entry.getValue();
                number = entry.getKey();
            }
        }
        return number;
    }

    private static boolean isSmallerThan(String num1, String num2) {
        if (num1.length() == num2.length()) {
            return num1.compareTo(num2) < 0;
        } else {
            return num1.length() < num2.length();
        }
    }
}
