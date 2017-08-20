package johny.learningtocode.hackerearth.ds.arrays.oned;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeighingTheStonesTest {

    @Test
    public void testWeightTheStones() {
        String[] rupamStones = "5 9 3 0 1 5 2".split("\\s");
        String[] ankitStones = "2 2 4 0 6 1 8".split("\\s");
        assertEquals("Rupam", WeighingTheStones.findWinner(rupamStones, ankitStones));

        rupamStones = "5 5 5 0 0 0".split("\\s");
        ankitStones = "0 0 1 1 1 1".split("\\s");
        assertEquals("Rupam", WeighingTheStones.findWinner(rupamStones, ankitStones));

        rupamStones = "5 5 5 0 0 0".split("\\s");
        ankitStones = "0 0 5 5 5 5".split("\\s");
        assertEquals("Tie", WeighingTheStones.findWinner(rupamStones, ankitStones));

        rupamStones = "5 5 5 0 0 0".split("\\s");
        ankitStones = "0 0 6 6 6 4".split("\\s");
        assertEquals("Ankit", WeighingTheStones.findWinner(rupamStones, ankitStones));
    }
}
