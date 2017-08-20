package johny.learningtocode.hackerrank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftRotation {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().split("\\s");
        int n = Integer.parseInt(firstLine[0]);
        int d = Integer.parseInt(firstLine[1]);

        String[] array = reader.readLine().split("\\s");
        doLeftRotation(array, d);
        printArray(array);
        reader.close();
    }

    private static void printArray(String[] array) {
        StringBuilder builder = new StringBuilder();
        for (String element : array) {
            builder.append(element).append(" ");
        }
        System.out.println(builder.toString());
    }

    static void doLeftRotation(String[] array, int d) {
        d = d % array.length;
        for (int i = 0; i < gcd(array.length, d); i++) {
            String temp = array[i];
            int j = i;
            while (true) {
                int k = j + d;
                if (k >= array.length) {
                    k %= array.length;
                }
                if (k == i) {
                    array[j] = temp;
                    break;
                }
                array[j] = array[k];
                j = k;
            }
        }
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
