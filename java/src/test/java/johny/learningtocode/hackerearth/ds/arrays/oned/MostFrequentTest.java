package johny.learningtocode.hackerearth.ds.arrays.oned;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostFrequentTest {

    @Test
    public void testMostFrequent() {
        assertEquals("1", MostFrequent.getNumberWithMaxFrequency("1 2 3 4 1"));
        assertEquals("1", MostFrequent.getNumberWithMaxFrequency("1 2 2 4 1"));
        assertEquals("1", MostFrequent.getNumberWithMaxFrequency("1"));
        assertEquals("1", MostFrequent.getNumberWithMaxFrequency("1 1 1 1 1"));
        assertEquals("32", MostFrequent.getNumberWithMaxFrequency("3 4 32 222 32 222"));
        assertEquals("12", MostFrequent.getNumberWithMaxFrequency("12 12 13 13 1"));
        assertEquals("1", MostFrequent.getNumberWithMaxFrequency("1 3 2 1 1 1 1 1 1 2 2 2"));
        assertEquals("1", MostFrequent.getNumberWithMaxFrequency("1 1 1 11 2 2 2 3 3 3"));
    }
}