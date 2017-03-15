package johny.learningtocode.hackerearth.algorithms.stringalgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * problem url : https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/compiler-version-2/
 */
public class CompilerVersion {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            result.append(convertLineToNewCode(line)).append("\n");
        }
        System.out.println(result);
    }

    static StringBuilder convertLineToNewCode(String l) {
        StringBuilder line = new StringBuilder(l);
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == '/' && line.charAt(i + 1) == '/') {
                break;
            }
            if (line.charAt(i) == '-' && line.charAt(i + 1) == '>') {
                line.setCharAt(i, '.');
                line.deleteCharAt(i + 1);
            }
        }
        return line;
    }
}
