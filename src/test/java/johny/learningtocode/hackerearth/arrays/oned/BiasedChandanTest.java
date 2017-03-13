package johny.learningtocode.hackerearth.arrays.oned;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * problem url: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/biased-chandan/
 */
public class BiasedChandanTest {

    @Test
    public void testBiasedChandran() {
        int[] ratings = new int[]{5, 4, 9, 0, 0, 2};
        assertEquals(7, BiasedChandan.sumOfRatings(ratings));

        ratings = new int[]{5, 4, 0, 0, 0, 2};
        assertEquals(2, BiasedChandan.sumOfRatings(ratings));

        ratings = new int[]{0, 4, 9, 0, 2};
        assertEquals(6, BiasedChandan.sumOfRatings(ratings));

        ratings = new int[]{0, 4, 9, 0, 0};
        assertEquals(0, BiasedChandan.sumOfRatings(ratings));
    }
}
