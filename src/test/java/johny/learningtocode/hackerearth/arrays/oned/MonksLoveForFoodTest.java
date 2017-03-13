package johny.learningtocode.hackerearth.arrays.oned;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class MonksLoveForFoodTest {

    @Test
    public void testMonksLoveForFood() {
        StringBuilder result = new StringBuilder();
        Stack<Integer> foodPile = new Stack<>();
        String[][] query = new String[6][];
        query[0] = "1".split("\\s");
        query[1] = "2 5".split("\\s");
        query[2] = "2 7".split("\\s");
        query[3] = "2 9".split("\\s");
        query[4] = "1".split("\\s");
        query[5] = "1".split("\\s");
        for (String[] aQuery : query) {
            MonksLoveForFood.executeQuery(foodPile, aQuery, result);
        }
        assertEquals("No Food\n9\n7\n", result.toString());
    }
}
