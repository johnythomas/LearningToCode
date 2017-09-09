package johny.learningtocode.hackerrank.algorithms.warmup;

import org.junit.Test;

import java.util.StringTokenizer;

import static junit.framework.TestCase.assertEquals;

public class BirthdayCakeCandlesTest {

    @Test
    public void testGetNumberOfCandlesBlown() {
        assertEquals(1, BirthdayCakeCandles.getNumberOfCandlesBlown(new StringTokenizer("1")));
        assertEquals(1, BirthdayCakeCandles.getNumberOfCandlesBlown(new StringTokenizer("1 2")));
        assertEquals(2, BirthdayCakeCandles.getNumberOfCandlesBlown(new StringTokenizer("1 1")));
        assertEquals(3, BirthdayCakeCandles.getNumberOfCandlesBlown(new StringTokenizer("1 1 1")));
        assertEquals(1, BirthdayCakeCandles.getNumberOfCandlesBlown(new StringTokenizer("1 2 3")));
        assertEquals(1, BirthdayCakeCandles.getNumberOfCandlesBlown(new StringTokenizer("1 2 1")));
        assertEquals(2, BirthdayCakeCandles.getNumberOfCandlesBlown(new StringTokenizer("2 2 1")));
        assertEquals(2, BirthdayCakeCandles.getNumberOfCandlesBlown(new StringTokenizer("1 2 2")));
        assertEquals(2, BirthdayCakeCandles.getNumberOfCandlesBlown(new StringTokenizer("2 4 4 3")));
    }
}
