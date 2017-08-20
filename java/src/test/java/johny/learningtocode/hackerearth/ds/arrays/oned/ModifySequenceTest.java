package johny.learningtocode.hackerearth.ds.arrays.oned;

import org.junit.Test;

import java.util.StringTokenizer;

import static org.junit.Assert.assertEquals;

public class ModifySequenceTest {

    @Test
    public void testModifySequence() {
        assertEquals("YES", ModifySequence.isValidSequence(new StringTokenizer("2 2", " "), 2));
        assertEquals("NO", ModifySequence.isValidSequence(new StringTokenizer("1 1 1", " "), 3));
        assertEquals("YES", ModifySequence.isValidSequence(new StringTokenizer("1 2 1", " "), 3));
        assertEquals("YES", ModifySequence.isValidSequence(new StringTokenizer("1 2 2 1", " "), 4));
        assertEquals("YES", ModifySequence.isValidSequence(new StringTokenizer("0", " "), 1));
        assertEquals("YES", ModifySequence.isValidSequence(new StringTokenizer("2 2 2 2", " "), 4));
    }
}
