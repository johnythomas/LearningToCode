package johny.learningtocode.hackerearth.arrays.oned;

import org.junit.Test;

import java.util.StringTokenizer;

import static org.junit.Assert.assertEquals;

public class MonkAndWelcomeProblemTest {

    @Test
    public void testMockAndWelcomeProblem() {
        StringTokenizer a = new StringTokenizer("1 2 3 4 5", " ");
        StringTokenizer b = new StringTokenizer("4 5 3 2 10", " ");
        StringBuilder result = new StringBuilder();
        MonkAndWelcomeProblem.findArraySum(a, b, 5, result);
        assertEquals("5 7 6 6 15", result.toString().trim());
    }
}
