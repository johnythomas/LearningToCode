package johny.learningtocode.hackerearth.arrays.oned;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryQueriesTest {

    @Test
    public void testBinaryQuery() {
        StringBuilder array = new StringBuilder("1 0 1 1 0");
        BinaryQueries.doBinaryQuery(array, 2);
        StringBuilder resultArray = new StringBuilder("1 1 1 1 0");
        assertEquals(resultArray.toString(), array.toString());
        assertEquals("ODD", BinaryQueries.doBinaryQuery(array, 1, 4));
    }
}
