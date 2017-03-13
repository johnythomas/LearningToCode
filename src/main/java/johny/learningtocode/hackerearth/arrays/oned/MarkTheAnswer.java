package johny.learningtocode.hackerearth.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * problem url: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/mark-the-answer-1/
 */
public class MarkTheAnswer {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = reader.readLine().split("\\s");
        long x = Long.parseLong(line1[1]);
        String[] questions = reader.readLine().split("\\s");
        System.out.println(findScore(questions, x));
    }

    static long findScore(String[] questions, long x) {
        int score = 0;
        boolean hasSkipped = false;
        for (String question : questions) {
            long difficultyOfQn = Long.parseLong(question);
            if (difficultyOfQn > x) {
                if (hasSkipped) {
                    break;
                }
                hasSkipped = true;
            } else {
                score++;
            }
        }
        return score;
    }
}
