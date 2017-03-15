package johny.learningtocode.hackerearth.algorithms.stringalgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * problem url : https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/monk-teaches-palindrome/
 */
public class MonkTeachesPalindrome {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String line = reader.readLine();
            result.append(isEvenPalindrome(line)).append("\n");
        }
        System.out.println(result);
    }

    static String isEvenPalindrome(String line) {
        boolean isPalindrome = true;
        for (int i = 0, j = line.length() - 1; i < j; i++, j--) {
            if (line.charAt(i) != line.charAt(j)) {
                isPalindrome = false;
            }
        }
        String result;
        if (isPalindrome) {
            result = "YES ";
            result += line.length() % 2 == 0 ? "EVEN" : "ODD";
        } else {
            result = "NO";
        }
        return result;
    }
}
