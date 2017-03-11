package johny.learningtocode.hackerearth.arrays.oned;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MicroAndArrayUpdateTest {

    @Test
    public void testMicroAndArrayUpdate() {
        int[] array = new int[]{1, 2, 5};
        assertEquals(3, MicroAndArrayUpdate.findMinimumTimeRequired(array, 4));
        array = new int[]{2, 5, 5};
        assertEquals(0, MicroAndArrayUpdate.findMinimumTimeRequired(array, 2));
    }
}
