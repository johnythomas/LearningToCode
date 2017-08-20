package johny.learningtocode.hackerearth.ds.arrays.multidimensional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.Predicate;

/**
 * Problem URL - https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/add-alternate-elements-of-2-dimensional-array/
 */
public class AddAlternateElements {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer= new StringTokenizer(reader.readLine(), " ");
        int[] array = new int[tokenizer.countTokens()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(tokenizer.nextToken());
        }
        System.out.println(sumOfAlternateElements(array, index -> index % 2 == 0));
        System.out.println(sumOfAlternateElements(array, index -> index % 2 != 0));
    }

    static int sumOfAlternateElements(int[] array, Predicate<Integer> tester) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(tester.test(i)) {
                sum += array[i];
            }
        }
        return sum;
    }
}