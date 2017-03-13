package johny.learningtocode.hackerearth.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-lucky-minimum-3/description/
 */
public class MonkAndLuckyMinimum {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] array = reader.readLine().split("\\s");
            System.out.println(isLucky(array));
        }
    }

    static String isLucky(String[] array) {
        String min = array[0];
        int frequencyOfMin = 1;
        for (int i = 1; i < array.length; i++) {
            String currentElement = array[i];
            if (currentElement.equals(min)) {
                frequencyOfMin++;
            } else if ((currentElement.length() == min.length() && currentElement.compareTo(min) < 0) || currentElement.length() < min.length()) {
                min = currentElement;
                frequencyOfMin = 1;
            }
        }
        return frequencyOfMin % 2 != 0 ? "Lucky" : "Unlucky";
    }
}
