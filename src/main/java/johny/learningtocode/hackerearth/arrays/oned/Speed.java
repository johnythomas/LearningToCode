package johny.learningtocode.hackerearth.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Speed {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] speeds = reader.readLine().split("\\s");
            result.append(getNumberOfCarsWithMaxSpeed(speeds)).append("\n");
        }
        System.out.println(result);
    }

    static int getNumberOfCarsWithMaxSpeed(String[] speeds) {
        int numberOfCars = 1;
        long maxSpeed = Long.parseLong(speeds[0]);
        for (int i = 1; i < speeds.length; i++) {
            long currentCarSpeed = Long.parseLong(speeds[i]);
            if (currentCarSpeed <= maxSpeed) {
                numberOfCars++;
                maxSpeed = currentCarSpeed;
            }
        }
        return numberOfCars;
    }
}