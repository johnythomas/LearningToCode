package johny.learningtocode.hackerearth.ds.arrays.oned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * problem url : https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/x-4/
 */
public class WeighingTheStones {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            reader.readLine();
            String[] rupamStoneWeights = reader.readLine().split("\\s");
            String[] ankitStoneWeights = reader.readLine().split("\\s");

            result.append(findWinner(rupamStoneWeights, ankitStoneWeights)).append("\n");
        }
        System.out.print(result);
    }

    static String findWinner(String[] rupamStoneWeights, String[] ankitStoneWeights) {
        Map<Integer, Integer> rupamStoneWeightFrequencies = findStoneWeightFrequencies(rupamStoneWeights);
        Map<Integer, Integer> ankitStoneWeightFrequencies = findStoneWeightFrequencies(ankitStoneWeights);
        int rupamStoneWithMaxFeq = findWeightOfStoneWithMaxFrequency(rupamStoneWeightFrequencies);
        int ankitStoneWithMaxFreq = findWeightOfStoneWithMaxFrequency(ankitStoneWeightFrequencies);
        return rupamStoneWithMaxFeq == ankitStoneWithMaxFreq
                ? "Tie" : (rupamStoneWithMaxFeq > ankitStoneWithMaxFreq
                ? "Rupam" : "Ankit");
    }

    private static int findWeightOfStoneWithMaxFrequency(Map<Integer, Integer> stoneWeightFrequencies) {
        int weight = -1;
        int frequency = 0;
        for (Map.Entry<Integer, Integer> stoneFreqEntry : stoneWeightFrequencies.entrySet()) {
            if (stoneFreqEntry.getValue() > frequency || (stoneFreqEntry.getValue() == frequency && stoneFreqEntry.getKey() > weight)) {
                frequency = stoneFreqEntry.getValue();
                weight = stoneFreqEntry.getKey();
            }
        }
        return weight;
    }


    private static Map<Integer, Integer> findStoneWeightFrequencies(String[] stoneWeights) {
        Map<Integer, Integer> stoneWeightFrequencies = new HashMap<>();
        for (String weight : stoneWeights) {
            int w = Integer.parseInt(weight);
            if (stoneWeightFrequencies.containsKey(w)) {
                stoneWeightFrequencies.put(w, stoneWeightFrequencies.get(w) + 1);
            } else {
                stoneWeightFrequencies.put(w, 1);
            }
        }
        return stoneWeightFrequencies;
    }
}
