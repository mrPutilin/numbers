package core.hw2.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> stream = intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder()).toList();
        System.out.println(stream);


    }
}