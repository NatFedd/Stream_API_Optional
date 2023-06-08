import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Main {
    public static void main(String[] args) {
    }

    public static void findMinMax(
            Stream<? extends Integer> stream,
            Comparator <? super Integer> order,
            BiConsumer <? super Integer, ? super Integer> minMaxConsumer
            ) {

        List<Integer> findMinMax = stream
                .filter(Objects::nonNull)
                .sorted(order)
                .collect(Collectors.toList());

        public static void filterNumbers;
        (
            ArrayList<Integer> numbers = new ArrayList<>();

            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            )
        {

            ArrayList<Integer> filterNumbers(n%2)==0) = numbers.stream()
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));
            System.out.println("Цифры отсоритрованы, выведены четные: " + filterNumbers);
        }
    }
}
