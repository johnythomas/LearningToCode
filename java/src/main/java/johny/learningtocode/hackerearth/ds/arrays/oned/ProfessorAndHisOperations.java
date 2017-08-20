package johny.learningtocode.hackerearth.ds.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ProfessorAndHisOperations {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(reader.readLine());
        String[] array = reader.readLine().split("\\s");
        int numberOfOperations = Integer.parseInt(reader.readLine());
        int[] operations = new int[arraySize];
        Arrays.fill(operations, 0);
        // reading the operations and storing it in operations array
        while (numberOfOperations-- > 0) {
            String[] lr = reader.readLine().split("\\s");
            int l = Integer.parseInt(lr[0]);
            int r = Integer.parseInt(lr[1]);
            operations[l - 1]++;
            operations[r]--;
        }
        System.out.println(Arrays.toString(operations));
        // finding the times the swap has to be done
        for (int i = 1; i < operations.length; i++) {
            operations[i] += operations[i - 1];
        }
        for (int i = 0, j = arraySize - 1; i < arraySize / 2; i++, j--) {
            operations[i] += operations[j];
        }
        System.out.println(Arrays.toString(operations));
        // doing the actual swapping
        for (int i = 0, j = arraySize - 1; i < arraySize / 2; i++, j--) {
            if (operations[i] % 2 != 0) {
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // printing the result
        StringBuilder result = new StringBuilder();
        for (String ele : array) {
            result.append(ele).append(" ");
        }
        System.out.println(result);
    }
}
