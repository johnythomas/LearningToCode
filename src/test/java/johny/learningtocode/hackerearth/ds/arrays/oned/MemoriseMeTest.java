package johny.learningtocode.hackerearth.ds.arrays.oned;

import org.junit.Test;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MemoriseMeTest {

    @Test
    public void testMemorizeMe() {
        String[] array = "1 2 3 4".split("\\s");
        Map<Integer, Integer> numberFrequency = MemoriseMe.findNumberFrequency(array, 4);
        numberFrequency.values().stream().forEach(val -> assertEquals(1, val.intValue()));
        Stream.of(array).forEach(ele -> assertEquals("1", MemoriseMe.executeQuery(Integer.parseInt(ele), numberFrequency)));
        assertEquals("NOT PRESENT", MemoriseMe.executeQuery(7, numberFrequency));

        array = "1 2 3 4 1".split("\\s");
        Map<Integer, Integer> numberFrequency1 = MemoriseMe.findNumberFrequency(array, 5);
        assertEquals("2", MemoriseMe.executeQuery(1, numberFrequency1));
        assertEquals("1", MemoriseMe.executeQuery(2, numberFrequency1));
        assertEquals("NOT PRESENT", MemoriseMe.executeQuery(5, numberFrequency1));
    }

}