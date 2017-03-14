package johny.learningtocode.hackerearth.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * problem url : https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-rotation-3/
 */
public class MonkAndRotation {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] line = reader.readLine().split("\\s");
            int n = Integer.parseInt(line[0]);
            int numberOfSteps = Integer.parseInt(line[1]);
            String[] array = reader.readLine().split("\\s");

            rotateArray(n, numberOfSteps, array);
            printArray(array);
        }
    }

    static void rotateArray(int n, int numberOfSteps, String[] array) {
        if (numberOfSteps >= n) {
            numberOfSteps = numberOfSteps % n;
        }
        int gcd = 1;
        if (numberOfSteps != 0) {
            gcd = gcd(n, numberOfSteps);
        }
        for (int i = 0; i < gcd; i++) {
            String temp = array[n - i - 1];
            int j = n - i - 1;
            int indexAfterShift = j;
            do {
                int indexBeforeShift = indexAfterShift - numberOfSteps;
                if (indexBeforeShift < 0) {
                    indexBeforeShift = n + indexBeforeShift;
                }
                array[indexAfterShift] = array[indexBeforeShift];
                indexAfterShift = indexBeforeShift;
            } while (indexAfterShift != j);
            array[(j + numberOfSteps) % n] = temp;
        }
    }

    private static void printArray(String[] array) {
        StringBuilder resultBuilder = new StringBuilder();
        for (String element : array) {
            resultBuilder.append(element).append(" ");
        }
        System.out.println(resultBuilder);
    }

    private static int gcd(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }
}
