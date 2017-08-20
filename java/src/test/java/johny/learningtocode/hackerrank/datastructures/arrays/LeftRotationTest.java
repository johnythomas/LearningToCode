package johny.learningtocode.hackerrank.datastructures.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftRotationTest {

    @Test
    public void doLeftRotation() {
        String[] inputArray = "1 2 3 4 5".split("\\s");
        String[] expectedArray = "3 4 5 1 2".split("\\s");
        LeftRotation.doLeftRotation(inputArray, 2);
        assertArray(expectedArray, inputArray);

        inputArray = "1 2 3 4 5".split("\\s");
        expectedArray = "1 2 3 4 5".split("\\s");
        LeftRotation.doLeftRotation(inputArray, 5);
        assertArray(expectedArray, inputArray);

        inputArray = "1 2 3 4 5".split("\\s");
        expectedArray = "3 4 5 1 2".split("\\s");
        LeftRotation.doLeftRotation(inputArray, 7);
        assertArray(expectedArray, inputArray);
    }

    private void assertArray(String[] expected, String[] actual) {
        assertEquals("lengths are not same", expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}