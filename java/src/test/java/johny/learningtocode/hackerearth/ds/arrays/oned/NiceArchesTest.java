package johny.learningtocode.hackerearth.ds.arrays.oned;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class NiceArchesTest {

    @Test
    public void testNiceArches() {
        assertTrue(NiceArches.isBubbly("abba"));
        assertFalse(NiceArches.isBubbly("abaa"));
        assertTrue(NiceArches.isBubbly("abaaba"));
        assertFalse(NiceArches.isBubbly("a"));
        assertTrue(NiceArches.isBubbly("bb"));
        assertTrue(NiceArches.isBubbly("bbaa"));
        assertTrue(NiceArches.isBubbly("baababbbaababb"));
    }
}