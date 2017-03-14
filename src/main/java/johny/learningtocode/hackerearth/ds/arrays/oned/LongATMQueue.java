package johny.learningtocode.hackerearth.ds.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * problem url: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/long-atm-queue-3/description/
 */
public class LongATMQueue {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] array = reader.readLine().split("\\s");
        System.out.println(findTotalGroups(array));
    }

    static int findTotalGroups(String[] array) {
        int totalGroups = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < array[i - 1].length() || (array[i].length() == array[i - 1].length() && array[i].compareTo(array[i - 1]) < 0)) {
                totalGroups++;
            }
        }
        return totalGroups;
    }
}
