package johny.learningtocode.hackerearth.ds.arrays.multidimensional;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class AddAlternateElementsTest {

    @Test
    public void testAddAlternateElementsEven() {
        Predicate<Integer> tester = index -> index % 2 == 0;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(25, AddAlternateElements.sumOfAlternateElements(array, tester));
        array = new int[]{1, 2};
        assertEquals(1, AddAlternateElements.sumOfAlternateElements(array, tester));
        array = new int[]{1, 2, 3};
        assertEquals(4, AddAlternateElements.sumOfAlternateElements(array, tester));
        array = new int[]{1};
        assertEquals(1, AddAlternateElements.sumOfAlternateElements(array, tester));
    }

    @Test
    public void testAddAlternateElementsNonEven() {
        Predicate<Integer> tester = index -> index % 2 != 0;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(20, AddAlternateElements.sumOfAlternateElements(array, tester));
        array = new int[]{1, 2};
        assertEquals(2, AddAlternateElements.sumOfAlternateElements(array, tester));
        array = new int[]{1, 2, 3};
        assertEquals(2, AddAlternateElements.sumOfAlternateElements(array, tester));
        array = new int[]{1};
        assertEquals(0, AddAlternateElements.sumOfAlternateElements(array, tester));
    }
}
