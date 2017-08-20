package johny.learningtocode.hackerearth.ds.arrays.oned;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongATMQueueTest {

    @Test
    public void testLongATMQueue() {
        String[] heightsArray = "1 2 3 4".split("\\s");
        assertEquals(1, LongATMQueue.findTotalGroups(heightsArray));
        heightsArray = "1 2 1 4".split("\\s");
        assertEquals(2, LongATMQueue.findTotalGroups(heightsArray));
        heightsArray = "1".split("\\s");
        assertEquals(1, LongATMQueue.findTotalGroups(heightsArray));
        heightsArray = "1 2".split("\\s");
        assertEquals(1, LongATMQueue.findTotalGroups(heightsArray));
        heightsArray = "1 2 1".split("\\s");
        assertEquals(2, LongATMQueue.findTotalGroups(heightsArray));
    }
}
