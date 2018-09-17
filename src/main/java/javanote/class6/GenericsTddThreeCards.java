package javanote.class6;

import java.util.*;

public class GenericsTddThreeCards {

    public List<Triple<Integer, Integer, Integer>> find(List<Integer> cards, int target) {

        cards.sort((o1, o2) -> o1 > o2 ? 1 : o1 < o2 ? -1 : 0);
        List<Triple<Integer, Integer, Integer>> result = new ArrayList<>();

        for (int i1 = 0; i1 < cards.size() - 2; i1++) {
            for (int i2 = i1 + 1; i2 < cards.size() - 1; i2++) {
                for (int i3 = i2 + 1; i3 < cards.size(); i3++) {
                    Triple<Integer, Integer, Integer> triple = Triple.of(cards.get(i1), cards.get(i2), cards.get(i3));
                    if (cards.get(i1) + cards.get(i2) + cards.get(i3) == target &&
                            !result.contains(triple)) {
                        result.add(triple);
                    }
                }
            }
        }

        return result;
    }
}
