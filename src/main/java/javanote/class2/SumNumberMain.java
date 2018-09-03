package javanote.class2;

import java.util.*;

public class SumNumberMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        List<Integer> numbers = refineNumbers(input1);
        int sum = Integer.parseInt(input2);

        SumNumbers sumNumbers = new SumNumbers();
        Set<String> result = sumNumbers.quiz(numbers, sum);
        System.out.println(result);
    }

    private static List<Integer> refineNumbers(String input1) {

        String[] numbers = input1.split(" ");
        List<Integer> numberList = new ArrayList<>();
        for (String number : numbers) {
            numberList.add(Integer.parseInt(number));
        }

        numberList.sort(Comparator.naturalOrder());
        return numberList;
    }
}
