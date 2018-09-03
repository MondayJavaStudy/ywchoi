package javanote.class4;

import java.util.*;

public class TddThreeCards {

    public List<Triple> find(List<Integer> cards, int target) {

        Collections.sort(cards);
        List<Triple> result = new ArrayList<>();

        for (int i1 = 0; i1 < cards.size() - 2; i1++) {
            for (int i2 = i1 + 1; i2 < cards.size() - 1; i2++) {
                for (int i3 = i2 + 1; i3 < cards.size(); i3++) {
                    Triple triple = new Triple(cards.get(i1), cards.get(i2), cards.get(i3));
                    if (cards.get(i1) + cards.get(i2) + cards.get(i3) == target &&
                            !result.contains(triple)) {
                        result.add(triple);
                    }
                }
            }
        }

        return result;
    }

    public static class Triple {

        private int card1;
        private int card2;
        private int card3;

        public Triple(int card1, int card2, int card3) {

            this.card1 = card1;
            this.card2 = card2;
            this.card3 = card3;
        }

        @Override
        public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Triple triple = (Triple) o;
            return card1 == triple.card1 &&
                    card2 == triple.card2 &&
                    card3 == triple.card3;
        }

        @Override
        public int hashCode() {

            return Objects.hash(card1, card2, card3);
        }
    }
}
