package johny.learningtocode.hackerearth.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BiasedChandan {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(sumOfRatings(ratings));
    }

    static long sumOfRatings(int[] ratings) {
        long sumOfRatings = 0;
        Stack<Integer> stack = new Stack<>();
        for (int rating : ratings) {
            stack.push(rating);
            sumOfRatings += rating;
            if (stack.peek() == 0) {
                stack.pop();
                if (!stack.isEmpty()) {
                    sumOfRatings -= stack.pop();
                }
            }
        }
        return sumOfRatings;
    }

}
