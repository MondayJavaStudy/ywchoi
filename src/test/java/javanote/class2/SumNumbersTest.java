package javanote.class2;

import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class SumNumbersTest {

    @Test
    public void success() {

        // given
        SumNumbers sumNumbers = new SumNumbers();

        // when
        Set<String> result = sumNumbers.quiz(Arrays.asList(1, 2, 3, 4, 5), 8);

        // then
        Set<String> actual = new HashSet<>();
        actual.add("1 2 5");
        actual.add("1 3 4");

        assertThat(result, is(actual));
    }

    @Test
    public void no() {

        // given
        SumNumbers sumNumbers = new SumNumbers();

        // when
        Set<String> result = sumNumbers.quiz(Arrays.asList(1, 2, 3, 4, 5), 3);

        // then
        Set<String> actual = new HashSet<>();
        actual.add("NO");

        assertThat(result, is(actual));
    }

    @Test
    public void numberSizeOver20() {

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
            assertThat(e.getMessage(), is("over size"));
        }
    }

    @Test
    public void sumUnderMinValue() {

        // given
        SumNumbers sumNumbers = new SumNumbers();

        // when
        try {
            sumNumbers.quiz(Arrays.asList(1, 2, 3, 4, 5), -1);
            fail();
        } catch (Exception e) {
            assertThat(e.getMessage(), is("sum invalid"));
        }
    }

    @Test
    public void sumOverMaxValue() {

        // given
        SumNumbers sumNumbers = new SumNumbers();

        // when
        try {
            sumNumbers.quiz(Arrays.asList(1, 2, 3, 4, 5), 61);
            fail();
        } catch (Exception e) {
            assertThat(e.getMessage(), is("sum invalid"));
        }
    }
}