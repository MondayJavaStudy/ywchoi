package javanote.class4;

import javanote.class4.TddThreeCards.Triple;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TddThreeCardsTest {

    TddThreeCards tddThreeCards = new TddThreeCards();

    @Test
    void 단순한_값_반환() {

        List<Integer> cards = Arrays.asList(1, 2, 3);
        int target = 6;
        List<Triple> expectation = Arrays.asList(new Triple(1, 2, 3));
        List<Triple> result = tddThreeCards.find(cards, target);

        for (int i = 0; i < expectation.size(); i++) {
            assertEquals(expectation.get(i), result.get(i));
        }
    }

    @Test
    void 카드_순서() {

        List<Integer> cards = Arrays.asList(2, 4, 1, 3);
        int target = 6;
        List<Triple> expectation = Arrays.asList(new Triple(1, 2, 3));
        List<Triple> result = tddThreeCards.find(cards, target);

        for (int i = 0; i < expectation.size(); i++) {
            assertEquals(expectation.get(i), result.get(i));
        }
    }

    @Test
    void 결과가_여럿인_경우() {

        List<Integer> cards = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int target = 10;
        List<Triple> expectation = Arrays.asList(new Triple(1, 2, 7),
                                                 new Triple(1, 3, 6),
                                                 new Triple(1, 4, 5),
                                                 new Triple(2, 3, 5));
        List<Triple> result = tddThreeCards.find(cards, target);

        assertEquals(expectation.size(), result.size());
        for (int i = 0; i < expectation.size(); i++) {
            assertEquals(expectation.get(i), result.get(i));
        }
    }

    @Test
    void 중복된_결과() {

        List<Integer> cards = Arrays.asList(1, 1, 2, 3, 4);
        int target = 6;
        List<Triple> expectation = Arrays.asList(new Triple(1, 1, 4),
                                                 new Triple(1, 2, 3)
        );
        List<Triple> result = tddThreeCards.find(cards, target);

        assertEquals(expectation.size(), result.size());
        for (int i = 0; i < expectation.size(); i++) {
            assertEquals(expectation.get(i), result.get(i));
        }
    }

    @Test
    void 배열_equals() {

        int[] first = new int[]{1, 2, 3};
        int[] second = new int[]{1, 2, 3};

        assertFalse(first.equals(second));
    }

    @Test
    void 리스트_equals() {

        List<Integer> first = Arrays.asList(1, 2, 3);
        List<Integer> second = Arrays.asList(1, 2, 3);

        assertTrue(first.equals(second));
    }
}
