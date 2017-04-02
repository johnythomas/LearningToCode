package johny.learningtocode.hackerrank.datastructures.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlgorithmicCrushTest {

    @Test
    public void testAlgorithmicCrush() {
        String[] operations = new String[]{"1 2 500", "2 5 400", "3 4 100"};
        assertEquals(900, AlgorithmicCrush.findMaxValue(6, operations));

        operations = new String[]{"1 2 100", "2 5 100", "3 4 100"};
        assertEquals(200, AlgorithmicCrush.findMaxValue(5, operations));
    }
}
