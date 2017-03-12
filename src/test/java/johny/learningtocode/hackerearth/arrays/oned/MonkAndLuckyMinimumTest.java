package johny.learningtocode.hackerearth.arrays.oned;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MonkAndLuckyMinimumTest {

    @Test
    public void testMonkAndLuckyMinimum() throws IOException {
        String[] array = "8 8 9 5 9".split("\\s");
        assertEquals("Lucky", MonkAndLuckyMinimum.isLucky(array));
        array = "3 3 3 5 3".split("\\s");
        assertEquals("Unlucky", MonkAndLuckyMinimum.isLucky(array));
        array = "3".split("\\s");
        assertEquals("Lucky", MonkAndLuckyMinimum.isLucky(array));
        array = "2 2".split("\\s");
        assertEquals("Unlucky", MonkAndLuckyMinimum.isLucky(array));
        array = "2 4 6".split("\\s");
        assertEquals("Lucky", MonkAndLuckyMinimum.isLucky(array));
    }
}
