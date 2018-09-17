package javanote.class6;

import java.util.Objects;

public class Triple <T1, T2, T3> implements Comparable<Triple>{

    private T1 card1;
    private T2 card2;
    private T3 card3;

    public Triple(T1 card1, T2 card2, T3 card3) {

        this.card1 = card1;
        this.card2 = card2;
        this.card3 = card3;
    }

    public static <T1, T2, T3> Triple<T1, T2, T3> of(T1 card1, T2 card2, T3 card3) {

        return new Triple<>(card1, card2, card3);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triple triple = (Triple) o;
        return Objects.equals(card1, triple.card1) &&
                Objects.equals(card2, triple.card2) &&
                Objects.equals(card3, triple.card3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(card1, card2, card3);
    }

    @Override
    public int compareTo(Triple o) {

        return 0;
    }
}