package johny.learningtocode.hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Problem url: https://www.hackerrank.com/challenges/birthday-cake-candles
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        StringTokenizer heightTokens = new StringTokenizer(reader.readLine(), " ");
        System.out.println(getNumberOfCandlesBlown(heightTokens));
        reader.close();
    }

    static int getNumberOfCandlesBlown(StringTokenizer heightTokens) {
        int freq = 0;
        int largestHeight = -1;
        while (heightTokens.hasMoreTokens()) {
            int height = Integer.parseInt(heightTokens.nextToken());
            if (height == largestHeight) {
                freq++;
            } else if (height > largestHeight) {
                largestHeight = height;
                freq = 1;
            }
        }
        return freq;
    }
}
