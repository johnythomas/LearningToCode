package johny.learningtocode.hackerearth.ds.arrays.oned;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpeedTest {

	@Test
	public void testSpeed() {
		String[] speeds = "10".split("\\s");
		assertEquals(1, Speed.getNumberOfCarsWithMaxSpeed(speeds));
		
		speeds = "10 20".split("\\s");
		assertEquals(1, Speed.getNumberOfCarsWithMaxSpeed(speeds));
		
		speeds = "10 9 2 3".split("\\s");
		assertEquals(3, Speed.getNumberOfCarsWithMaxSpeed(speeds));
		
		speeds = "10 9 8 7".split("\\s");
		assertEquals(4, Speed.getNumberOfCarsWithMaxSpeed(speeds));
		
		speeds = "1 2 3 4".split("\\s");
		assertEquals(1, Speed.getNumberOfCarsWithMaxSpeed(speeds));
	}
}