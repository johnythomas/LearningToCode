package johny.learningtocode.hackerearth.ds.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-power-of-time/
 */
public class MonkAndPowerOfTime {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] callingOrder = reader.readLine().split("\\s");
        String[] idealOrder = reader.readLine().split("\\s");

        System.out.println(findTimeTakenToProcess(callingOrder, idealOrder));
    }

    static int findTimeTakenToProcess(String[] callingOrder, String[] idealOrder) {
        int timeTaken = 0;
        for (int i = 0; i < callingOrder.length; i++) {
            if (callingOrder[i].equals(idealOrder[i])) {
                timeTaken++;
                continue;
            }
            for (int j = i; j < callingOrder.length - 1; j++) {
                String temp = callingOrder[j];
                callingOrder[j] = callingOrder[j + 1];
                callingOrder[j + 1] = temp;
            }
            timeTaken++;
            i--;
        }
        return timeTaken;
    }
}
