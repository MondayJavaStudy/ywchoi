package javanote.class6;

public class Tuple {

    public static <T1, T2> Pair<T1, T2> tuple(T1 val1, T2 val2) {
        return Pair.of(val1, val2);
    }

    public static <T1, T2, T3> Triple<T1, T2, T3> tuple(T1 val1, T2 val2, T3 val3){
        return Triple.of(val1, val2, val3);
    }
}
