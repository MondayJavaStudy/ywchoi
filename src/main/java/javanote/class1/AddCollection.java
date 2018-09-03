package javanote.class1;

import java.util.*;

public class AddCollection {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Clementine", "Duran", "Mike"));
        names.parallelStream().forEach(System.out::println);

        List<Integer> emptyList = Collections.emptyList();
    }
}
