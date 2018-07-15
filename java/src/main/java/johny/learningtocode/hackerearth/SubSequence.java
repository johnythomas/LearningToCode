package johny.learningtocode.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Problem URL: https://www.hackerearth.com/problem/algorithm/aprileasy-the-one-with-the-queries-3/
 */
public class SubSequence {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[][] nextArr = createNextArr(str);

        StringBuilder result = new StringBuilder();

        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            String query = br.readLine();
            result.append(query.length() <= str.length() && isSubSequence(nextArr, query)
                    ? "Yes"
                    : "No").append("\n");
        }

        System.out.println(result.toString());

    }

    private static int[][] createNextArr(String str) {
        int len = str.length();
        int[][] next = new int[len][26];
        for (int i = 0; i < 26; i++) {
            next[len - 1][i] = len;
        }
        next[len - 1][str.charAt(len - 1) - 'a'] = len - 1;
        for (int i = len - 2; i >= 0; i--) {
            System.arraycopy(next[i + 1], 0, next[i], 0, 26);
            next[i][str.charAt(i) - 'a'] = i;
        }
        return next;
    }

    private static boolean isSubSequence(int[][] nextArr, String query) {
        int strLen = nextArr.length;
        int len = query.length();
        int pos = 0;
        for (int i = 0; i < len; i++) {
            if (pos >= strLen) {
                return false;
            }
            int nextPos = nextArr[pos][query.charAt(i) - 'a'];
            if (nextPos >= strLen) {
                return false;
            }
            pos = nextPos + 1;
        }
        return true;
    }
}
