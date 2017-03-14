package johny.learningtocode.hackerearth.arrays.oned;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonkAndRotationTest {

    @Test
    public void testMonkAndRotation() {
        String[] array = "1 2 3 4 5 6".split("\\s");
        String[] expectedArray = "6 1 2 3 4 5".split("\\s");
        MonkAndRotation.rotateArray(6, 1, array);
        assertArray(array, expectedArray);

        array = "1 2 3 4 5 6".split("\\s");
        expectedArray = "1 2 3 4 5 6".split("\\s");
        MonkAndRotation.rotateArray(6, 6, array);
        assertArray(array, expectedArray);

        array = "1 2 3 4 5 6".split("\\s");
        expectedArray = "6 1 2 3 4 5".split("\\s");
        MonkAndRotation.rotateArray(6, 7, array);
        assertArray(array, expectedArray);
    }

    private void assertArray(String[] array, String[] expectedArray) {
        for (int i = 0; i < array.length; i++) {
            assertEquals(expectedArray[i], array[i]);
        }
    }
}