package my.test.bed.epam.interviewing;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Find the most frequent int value in the array.
 */
public class MostFrequentIntegerInArray {


    //int value
    //frequency of occurrence
    //1 - 4
    //22 - 3
    //50 - 9
    public static int getMostFrequentInt(final int[] array) {

        if (array == null || array.length == 0) return 0;
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        for (int i : array) {
            occurrenceMap.putIfAbsent(i, 0);
            occurrenceMap.put(i, occurrenceMap.get(i) + 1);
        }

        int occurrence = 0;
        int value = 0;
        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            if (occurrence < entry.getValue()) {
                occurrence = entry.getValue();
                value = entry.getKey();
            }
        }
        return value;


    }


    public static int getMostFrequentInt2(final int[] array) {

        if (array == null || array.length == 0) return 0;

        Map<Integer, Integer> occurrenceMapIndex =
            IntStream.of(array)
                    .collect(HashMap::new,
                            (integerIntegerHashMap, value) -> {
                                integerIntegerHashMap.putIfAbsent(value, 0);
                                integerIntegerHashMap.put(value, integerIntegerHashMap.get(value) + 1);
                    }, HashMap::putAll);

        Optional<Map.Entry<Integer, Integer>> mostFrequentElement =
                occurrenceMapIndex.entrySet()
                        .stream()
                        .max(Comparator.comparing(Map.Entry::getValue));

        return mostFrequentElement.isPresent() ? mostFrequentElement.get().getKey() : 0;

    }


    public static void main(String[] args) {
        int[] array = {23,53,43,1,3,12,23,23,23,90,1,1,1,1,10, 23, 23, 23, 33, 4 , 23};
        int result = getMostFrequentInt2(array);

        System.out.println(result);
    }
}
