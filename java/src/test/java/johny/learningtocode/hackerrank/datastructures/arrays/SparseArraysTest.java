package johny.learningtocode.hackerrank.datastructures.arrays;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SparseArraysTest {

    @Test
    public void testSparseArrays() {
        String[] array = new String[]{"abc", "efg", "abc", "hij", "a", "b", "efg", "a"};
        Map<String, Integer> stringCount = new HashMap<>();
        for (String element : array) {
            SparseArrays.addString(stringCount, element);
        }
        Map<String, Integer> expectedCount = new HashMap<>();
        expectedCount.put("abc", 2);
        expectedCount.put("efg", 2);
        expectedCount.put("hij", 1);
        expectedCount.put("a", 2);
        expectedCount.put("b", 1);
        for (Map.Entry<String, Integer> entry : stringCount.entrySet()) {
            assertEquals(expectedCount.get(entry.getKey()).intValue(), entry.getValue().intValue());
        }
    }
}
