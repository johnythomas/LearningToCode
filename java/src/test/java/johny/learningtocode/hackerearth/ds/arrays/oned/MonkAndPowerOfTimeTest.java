package johny.learningtocode.hackerearth.ds.arrays.oned;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonkAndPowerOfTimeTest {

    @Test
    public void testMockAndPowerOfTime() {
        String[] callingOrder = "3 2 1".split("\\s");
        String[] idealOrder = "1 2 3".split("\\s");
        assertEquals(6, MonkAndPowerOfTime.findTimeTakenToProcess(callingOrder, idealOrder));

        callingOrder = "3".split("\\s");
        idealOrder = "3".split("\\s");
        assertEquals(1, MonkAndPowerOfTime.findTimeTakenToProcess(callingOrder, idealOrder));

        callingOrder = "3 2 1".split("\\s");
        idealOrder = "1 3 2".split("\\s");
        assertEquals(5, MonkAndPowerOfTime.findTimeTakenToProcess(callingOrder, idealOrder));
    }
}
