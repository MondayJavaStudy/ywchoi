package javanote.class2;

import java.util.*;

public class SumNumbers {

    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 20;

    public Set<String> quiz(List<Integer> numbers, int sum) {

        Set<String> result = new HashSet<>();

        if (numbers.size() > 20) {
            throw new RuntimeException("over size");
        }

        if (MIN_VALUE > sum || sum > MAX_VALUE * 3) {
            throw new RuntimeException("sum invalid");
        }

        if (numbers.get(0) + numbers.get(1) + numbers.get(2) > sum) {
            result.add("NO");
            return result;
        }

        removeOverIndicies(numbers, sum);

        for (int i = 0; i < numbers.size() - 2; i++) {
            for (int j = i + 1; j < numbers.size() - 1; j++) {
                for (int k = j + 1; k < numbers.size(); k++) {
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k) == sum) {
                        result.add(String.format("%d %d %d", numbers.get(i), numbers.get(j), numbers.get(k)));
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add("NO");
        }

        return result;
    }

    private static void removeOverIndicies(List<Integer> numbers, int sum) {

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (sum <= numbers.get(i)) {
                numbers.remove(i--);
            } else {
                break;
            }
        }
    }
}
