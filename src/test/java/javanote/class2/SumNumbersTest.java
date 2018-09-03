package javanote.class2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class SumNumbersTest {

    @Test
    void success() {

        // given
        SumNumbers sumNumbers = new SumNumbers();

        // when
        Set<String> result = sumNumbers.quiz(Arrays.asList(1, 2, 3, 4, 5), 8);

        // then
        Set<String> actual = new HashSet<>();
        actual.add("1 2 5");
        actual.add("1 3 4");

        assertEquals(result, actual);
    }

    @Test
    void no() {

        // given
        SumNumbers sumNumbers = new SumNumbers();

        // when
        Set<String> result = sumNumbers.quiz(Arrays.asList(1, 2, 3, 4, 5), 3);

        // then
        Set<String> actual = new HashSet<>();
        actual.add("NO");

        assertEquals(result, actual);
    }

    @Test
    void numberSizeOver20() {

        // given
        SumNumbers sumNumbers = new SumNumbers();

        // when
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            numbers.add(1);
        }

        try {
            sumNumbers.quiz(numbers, 3);
            fail();
        } catch (Exception e) {
            assertEquals(e.getMessage(), "over size");
        }
    }

    @Test
    void sumUnderMinValue() {

        // given
        SumNumbers sumNumbers = new SumNumbers();

        // when
        try {
            sumNumbers.quiz(Arrays.asList(1, 2, 3, 4, 5), -1);
            fail();
        } catch (Exception e) {
            assertEquals(e.getMessage(), "sum invalid");
        }
    }

    @Test
    void sumOverMaxValue() {

        // given
        SumNumbers sumNumbers = new SumNumbers();

        // when
        try {
            sumNumbers.quiz(Arrays.asList(1, 2, 3, 4, 5), 61);
            fail();
        } catch (Exception e) {
            assertEquals(e.getMessage(), "sum invalid");
        }
    }
}