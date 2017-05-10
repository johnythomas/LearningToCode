package johny.learningtocode.hackerrank.algorithms;

import org.junit.Test;

import java.util.StringTokenizer;

import static junit.framework.TestCase.assertEquals;

public class BirthdayCakeCandlesTest {

    @Test
    public void testGetNumberOfCandlesBlowed() {
        assertEquals(1, BirthdayCakeCandles.getNumberOfCandlesBlowed(new StringTokenizer("1")));
        assertEquals(1, BirthdayCakeCandles.getNumberOfCandlesBlowed(new StringTokenizer("1 2")));
        assertEquals(2, BirthdayCakeCandles.getNumberOfCandlesBlowed(new StringTokenizer("1 1")));
        assertEquals(3, BirthdayCakeCandles.getNumberOfCandlesBlowed(new StringTokenizer("1 1 1")));
        assertEquals(1, BirthdayCakeCandles.getNumberOfCandlesBlowed(new StringTokenizer("1 2 3")));
        assertEquals(1, BirthdayCakeCandles.getNumberOfCandlesBlowed(new StringTokenizer("1 2 1")));
        assertEquals(2, BirthdayCakeCandles.getNumberOfCandlesBlowed(new StringTokenizer("2 2 1")));
        assertEquals(2, BirthdayCakeCandles.getNumberOfCandlesBlowed(new StringTokenizer("1 2 2")));
        assertEquals(2, BirthdayCakeCandles.getNumberOfCandlesBlowed(new StringTokenizer("2 4 4 3")));
    }
}
